package caffe_main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class menuOrderService {
	
	private menuOrderDAO dao;
	
	public menuOrderService() {
		dao = new menuOrderDAO();
	}
	
	public void menuchose(ArrayList<menuOrderVO> voArr) {
		
		for(int i = 0 ; i < voArr.size();i++) {
			dao.insert(voArr.get(i));
		}
		System.out.println("메뉴추가완료됐습니다");
	}
	public void select() {
		
		ArrayList<menuOrderVO> arr = dao.select();
		
		HashMap<Integer,rootVO> map = new HashMap<Integer, rootVO>();
		
		
		map.put(1,new rootVO("아메리카노", 3000));
		map.put(2,new rootVO("카페라떼", 3500));
		map.put(3,new rootVO("카푸치노", 1500));
		map.put(4,new rootVO("에스프레소", 2500));
		map.put(5,new rootVO("카페모카", 4000));
		map.put(6,new rootVO("치즈케이크", 5000));
		map.put(7,new rootVO("초코케이크", 4500));
		
		for (menuOrderVO a : arr) {
			System.out.println(map.get(Integer.parseInt(a.getName())) + "수량은 "+ a.getPrice() +"입니다.");
			
			map.get(Integer.parseInt(a.getName())).addSum(Integer.parseInt(a.getPrice()));
		}
		
		System.out.println("주문하신 총금액은 : " + rootVO.getSum());
		
	}
	
}
