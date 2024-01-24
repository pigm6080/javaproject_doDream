package caffe_main;

import java.util.ArrayList;

public class menuOrderDAO {
	
	private static ArrayList<menuOrderVO> arrOrder = new ArrayList<menuOrderVO>();
	
	public void insert(menuOrderVO vo) {
		arrOrder.add(vo);
	}
	
	public ArrayList select() {
		return arrOrder;
	}
	
}
