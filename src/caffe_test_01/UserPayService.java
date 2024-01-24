package caffe_test_01;

public class UserPayService {

    public void selectPaymentMethod(String paymentMethod) {
        switch (paymentMethod) {
            case "현금":
                cashPayment();
                break;
            case "카드":
                cardPayment();
                break;
            case "삼성페이 결제":
                mobilePayment();
                break;
            default:
                System.out.println("유효하지 않은 선택입니다. 다시 선택해주세요.");
                break;
        }
    }

    public void cashPayment() {
        System.out.println("현금 결제를 선택하셨습니다.");
        // 현금 결제 처리 로직 구현
    }

    public void cardPayment() {
        System.out.println("카드 결제를 선택하셨습니다.");
        // 카드 결제 처리 로직 구현
    }

    public void mobilePayment() {
        System.out.println("삼성페이 결제를 선택하셨습니다.");
        // 모바일 결제 처리 로직 구현
    }
}