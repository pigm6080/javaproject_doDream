package caffe_main;

import java.util.ArrayList;

public class OrderService {
  private CafeMemberVO cafeMemberVO;
  private ArrayList<menuOrderVO> orderList; 

  
  public OrderService(CafeMemberVO cafeMemberVO, ArrayList<menuOrderVO> orderList) {
      this.cafeMemberVO = cafeMemberVO;
      this.orderList = orderList;
      
  }
  
    public CafeMemberVO getCafeMemberVO() {
      return cafeMemberVO;
    }
  
    public void setCafeMemberVO(CafeMemberVO cafeMemberVO) {
      this.cafeMemberVO = cafeMemberVO;
    }
  
    public ArrayList<menuOrderVO> getOrderList() {
      return orderList;
    }
  
    public void setOrderList(ArrayList<menuOrderVO> orderList) {
      this.orderList = orderList;
    }

  
}
