package caffe_test_01;

public class loginService {
	
	private userDAO dao;
	
	public loginService() {
		dao = new userDAO();
	}
	
	public void login(String num) {
		
		if(num.equalsIgnoreCase("y")) {
		    System.out.println("-------------------------------------");
		    System.out.println("로그인 - 아이디 비밀번호");
		    
		}else if(num.equalsIgnoreCase("n")) {
		    System.out.println("-------------------------------------");
		    System.out.println("회원가입 - 아이디 비밀번호 비밀번호확인");
		    
		}else {
			System.out.println("질못된값을 입력하였습니다 다시 입력하세요.");
		}
		
	}
	
	public boolean checkLogin(String id,String pw) {
		
		String chpw = dao.selectOne(id);
		System.out.println(chpw);
		if(chpw == null) {
			
			System.out.println("입력한 아이디와 일치하는 회원정보가 없습니다");
			return false;
		}
		if(!chpw.equals(pw)) {
			System.out.println("비밀번호가 틀립니다.");
			return false;
		}
		
		return true;
	}
	

	
	
}
