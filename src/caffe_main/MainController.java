package caffe_main;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainController {
  
    public static void help() {
    System.out.println();
    System.out.println("안녕하세요. 팀 프로젝트 카페에 오신 것을 환영합니다.");
    System.out.println("-------------------------------------");
    System.out.println("1. 회원가입");
    System.out.println("2. 로그인");
    System.out.println("3. 비밀번호변경");
    System.out.println("4. 주문조회");
    System.out.println("5. 프로그램종료");
    System.out.println("-------------------------------------");
    }

    public static void register() {
    System.out.println();
    System.out.println("-------------------------------------");
    System.out.println("회원가입 - new 아이디 비밀번호 비밀번호확인");
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

    public static void menu() {
    System.out.println();
    System.out.println("********* 팀 프로젝트 카페 MENU ");
    System.out.println("     메뉴 1. 아메리카노  3,000원      ");
    System.out.println("     메뉴 2. 카페라떼   3,500원      ");
    System.out.println("     메뉴 3. 카푸치노   1,500원      ");
    System.out.println("  ß   메뉴 4. 에스프레소  2,500원      ");
    System.out.println("     메뉴 5. 카페모카   4,000원      ");
    System.out.println("     메뉴 6. 치즈케이크  5,000원      ");
    System.out.println("     메뉴 7. 초코케이크  4,500원      ");
    System.out.println("*** Thank you **************");
    System.out.println("주문방법 - 메뉴번호 수량 엔터 > 전체 주문 완료 후 ok 입력");
    }

    public static void payment() {
    System.out.println();
    System.out.println("**** 결제수단 ****");
    System.out.println(" 1. 현금 ");
    System.out.println(" 2. 카드 ");
    System.out.println(" 3. 삼성페이");
    }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true) {
      help();
      String userInput = sc.nextLine();
      
      if (userInput.equalsIgnoreCase("1")) {
        while(true) {
          register();
          System.out.println("회원가입을 진행하여 주세요.");
          userInput = sc.nextLine();
          String[] userInputs = userInput.split(" ");
    
          if (userInputs.length != 4) {
            System.out.println("입력하신 정보가 형식에 맞지 않습니다.");
            continue;
          }
    
          CafeMemberDTO dto = new CafeMemberDTO(userInputs[1], userInputs[2], userInputs[3]);
          if (!dto.comparePwd()) {
            System.out.println("비밀번호와 비밀번호 확인이 일치하지 않습니다.");
            continue;
          } else {
            MemberRegisterService regSrv = new MemberRegisterService();
            regSrv.regist(dto);
          }
          break;
        }
      } else if (userInput.equalsIgnoreCase("2")) {
        while(true) {
          login();
          System.out.println("아이디와 비밀번호를 입력해주세요.");
          userInput = sc.nextLine();
          String[] userInputs = userInput.split(" ");
          MemberCheckingService chk = new MemberCheckingService();
          
          if (userInputs.length != 2) {
            System.out.println("아이디와 비밀번호를 정확히 입력해주세요.");
            continue;
          } 
          
          if (chk.checking(userInputs[0], userInputs[1])) {
            System.out.println("로그인에 성공하였습니다.");
            menu();
            
            ArrayList<String> arrMenu = new ArrayList<String>();
            while (true) {
              String a = sc.nextLine();
              arrMenu.add(a);
              if (a.equalsIgnoreCase("ok")) {
                break;
              }
            }
            System.out.println("결제수단을 선택하세요.");
            payment();
            userInput = sc.nextLine();
            System.out.println("주문이 완료되었습니다. 감사합니다.");
          } else {
            System.out.println("아이디 혹은 비밀번호가 잘못되었습니다.");
            continue;
          }
          break;
        }
      } else if (userInput.equalsIgnoreCase("3")) {
        
      } else if (userInput.equalsIgnoreCase("4")) {
        menu();
        ArrayList<menuOrderVO> arrMenu = new ArrayList<menuOrderVO>();
        
        while (true) {
          String a = sc.nextLine();
          if (a.equalsIgnoreCase("ok")) {
            System.out.println("here");
            break;
          }
          String[] a1 = a.split(" ");  
          System.out.println(a1[0] + a1[1]);
          menuOrderVO vo = new menuOrderVO(a1[0],a1[1]);
          
          arrMenu.add(vo);
            
        }
        menuOrderService mos = new menuOrderService();
        mos.munuchose(arrMenu);
        
        
        System.out.println("주문이 완료되었습니다. 감사합니다.");
        
        mos.seleect();
      } else if (userInput.equalsIgnoreCase("5")) {
        System.out.println("프로그램을 종료합니다");
        break;
      } else {
        try {
          int userInputNumber = Integer.parseInt(userInput);
          if (userInputNumber < 1 || userInputNumber > 5) {
              System.out.println("1에서 5 사이의 숫자를 입력해주세요.");
          }
          } catch (NumberFormatException e) {
              System.out.println("숫자를 입력해주세요.");
          }
        }
      } sc.close();
    }
  
  }