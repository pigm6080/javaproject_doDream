package caffe_main;

import java.util.ArrayList;

public class OrderService {
    private ArrayList<menuOrderVO> menuOrders;
    private CafeMemberVO cafeMember;

    public OrderService() {
        this.menuOrders = new ArrayList<>();
        this.cafeMember = new CafeMemberVO();
    }

    public OrderService(ArrayList<menuOrderVO> menuOrders, CafeMemberVO cafeMember) {
        this.menuOrders = menuOrders;
        this.cafeMember = cafeMember;
    }

    public ArrayList<menuOrderVO> getMenuOrders() {
        return menuOrders;
    }

    public void setMenuOrders(ArrayList<menuOrderVO> menuOrders) {
        this.menuOrders = menuOrders;
    }

    public CafeMemberVO getCafeMember() {
        return cafeMember;
    }

    public void setCafeMember(CafeMemberVO cafeMember) {
        this.cafeMember = cafeMember;
    }

}