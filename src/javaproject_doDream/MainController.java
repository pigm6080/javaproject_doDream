package javaproject_doDream;

import java.util.Scanner;

public class MainController {
  
  
  public static void help() {
    System.out.println();
    System.out.println("환영합니다.");
  }
  
  public static void main(String[] args) {
    CafeMenuService cms = new CafeMenuService();
    CafeSalesService css = new CafeSalesService();
    UserMenuService ums = new UserMenuService();
    UserPayService ups = new UserPayService();

    Scanner sc = new Scanner(System.in);
    
    while (true) {
      
      System.out.println("아이디를 입력하세요");
      String userInput = sc.nextLine();

      String[] userInputs = userInput.split(" ");

      if (userInput.startsWith("new")) {

        if (userInputs.length != 4) {
          System.out.println("입력하신 정보가 형식에 맞지 않습니다.");
          help();
          continue;
        }

        UserMemberDTO dto = new UserMemberDTO(userInputs[1], userInputs[2], userInputs[3]);

        if (!dto.comparePwd()) {
          System.out.println("입력하신 비번이 일치하지 않습니다.");
          continue;
        }

        MemberRegisterService regSrv = new MemberRegisterService();
        regSrv.regist(dto);

      }
      
      
    }
    
  }
}
