package caffe_test_01;

import java.util.Scanner;

// MainController로써모든 로직 관리
public class MainController {
	public static void help() {
		  System.out.println("안녕하세요. 팀 프로젝트 카페에 오신 것을 환영합니다.");
		    System.out.println("-------------------------------------");
		    System.out.println("비밀번호변경 - 아이디 현재비밀번호 변경비밀번호");
		    System.out.println("메뉴호출 - menu");
		    System.out.println("정보조회 - info 아이디");
		    System.out.println("프로그램종료 - exit");
		    System.out.println("도움말 - help");
		    System.out.println("-------------------------------------");
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("안녕하세요. 팀 프로젝트 카페에 오신 것을 환영합니다.");
			System.out.println("기존 멤버십 회원이신가요? (Y/N)");
		    //유저가 입력한 값저장
		    String userIn = s.nextLine();
		    loginService los = new loginService();
		    
		    los.login(userIn);
		    
		    String[] userIns = s.nextLine().split(" ");
		    userDTO dto = null;
		    
		    	//로그인 메소드로 이동 
		    if(userIns.length==2) {
		    	
		    	if(los.checkLogin(userIns[0],userIns[1])) {
		    		
		    		System.out.println("아이디를 찾았다..");

		    	}
		    	
		    	//회원가입 메소드로 이
		    }else if(userIns.length == 3) {
		
		    	dto = new userDTO(userIns[0],userIns[1],userIns[2]);
		    	if(!dto.comparePwd()) {
		    		System.out.println("입력하신 비번이 일치하지 않습니다.");
		    		continue;
		    	}
		    	userRegisterSerivce usrSrv = new userRegisterSerivce();
			    usrSrv.regist(dto);
		    	
		    }else {
		    	System.out.println("다시입력하십시오 . ");
		    	continue;
		    }
			System.out.println("s");
			
		}
		
	}

}
