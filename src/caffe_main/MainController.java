package caffe_main;

import java.util.Scanner;



public class MainController {

    public static void help() {
        System.out.println();
        System.out.println("안녕하세요. 팀 프로젝트 카페에 오신 것을 환영합니다.");
        System.out.println("-------------------------------------");
        System.out.println("회원가입 - new 아이디 비밀번호");
        System.out.println("비밀번호변경 - change 아이디 현재비밀번호 변경비밀번호");
        System.out.println("로그인 - 아이디 비밀번호");
        System.out.println("메뉴호출 - menu");
        System.out.println("정보조회 - info 아이디");
        System.out.println("프로그램종료 - exit");
        System.out.println("도움말 - help");
        System.out.println("-------------------------------------");
    }
    
    public static void register() {
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("회원가입 - new 아이디 비밀번호");
        System.out.println("도움말 - help");
        System.out.println("-------------------------------------");
    }
    
    public static void login() {
    	System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("로그인 - 아이디 비밀번호");
        System.out.println("도움말 - help");       
        System.out.println("-------------------------------------");
    
    }

    public static void main(String[] args) {
        CafeMenuService cms = new CafeMenuService();
        CafeSalesService css = new CafeSalesService();
        UserMenuService ums = new UserMenuService();
        UserPayService ups = new UserPayService();

        Scanner sc = new Scanner(System.in);

        System.out.println("안녕하세요. 팀 프로젝트 카페에 오신 것을 환영합니다.");
        System.out.println("기존 멤버십 회원이신가요? (Y/N)");
        String userInput = sc.nextLine();
        
        String[] userInputs = userInput.split(" ");
        
        if (userInput.equalsIgnoreCase("N")) {
            register();
            System.out.println("회원가입을 진행하여 주세요.");
            userInput = sc.nextLine();
            userInputs = userInput.split(" ");
            
            if (userInputs.length != 3) {
            	System.out.println("입력하신 정보가 형식에 맞지 않습니다.");
            	register();
            	userInput = sc.nextLine();
            	userInputs = userInput.split(" ");
            	

            }
            
            RequestDTO dto = new RequestDTO(userInputs[1], userInputs[2], userInputs[3]);
        } else if(userInput.equalsIgnoreCase("Y")) {
        	login();
        	System.out.println("아이디와 비밀번호를 입력해주세요.");
        	userInput = sc.nextLine();
        	userInputs = userInput.split(" ");
        	
            if (userInputs.length != 2) {
            	System.out.println("입력하신 정보가 형식에 맞지 않습니다.");
            	login();
            	userInput = sc.nextLine();
            	userInputs = userInput.split(" ");
            }
        }

        // 나머지 로직 추가

    }
}