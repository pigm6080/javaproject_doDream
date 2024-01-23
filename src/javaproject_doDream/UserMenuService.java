package cafeProject;

public class UserMenuService {
    
    public void placeOrder(UserMemberVO menu) {

        System.out.println(menu.getName() + " 메뉴를 주문하셨습니다.");
        System.out.println("가격: " + menu.getPrice() + "원");
        System.out.println("주문이 완료되었습니다.");
    }
    
}

