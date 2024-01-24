package caffe_main;

import java.util.ArrayList;

public class OrderViewService {
    public static void viewOrder(ArrayList<OrderService> orderList, String id) {
        for (OrderService order : orderList) {
            if (order.getCafeMember().getId().equals(id)) {
                System.out.println("주문 내역:");
                for (menuOrderVO menuOrder : order.getMenuOrders()) {
                    String name = convertMenuName(menuOrder.getName());
                    String price = menuOrder.getPrice();
                    System.out.println("메뉴는 " + name + ", 수량은 " + price + "입니다.");
                }
                return;
            }
        }
        System.out.println("해당 ID로 주문한 내역이 없습니다.");
    }

    private static String convertMenuName(String name) {
        switch (name) {
            case "1":
                return "아메리카노";
            case "2":
                return "카페라떼";
            case "3":
                return "카푸치노";
            case "4":
              return "에스프레소";
            case "5":
              return "카페모카";
            case "6":
              return "치즈케이크";
            case "7":
              return "초코케이크";
            
            default:
                return "알 수 없는 메뉴";
        }
    }
}
