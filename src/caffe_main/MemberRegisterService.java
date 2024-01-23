package caffe_main;

public class MemberRegisterService {

	
	  private CafeMemberDAO dao;
	
	  public MemberRegisterService() {
	    this.dao = new CafeMemberDAO();
	  }
	  
	
	  public void regist(CafeMemberDTO dto) {
	
	    CafeMemberVO vo = new CafeMemberVO(dto.getId(), dto.getPwd());
	    
	    if (dao.selectOne(dto.getId()) != null) {
	      System.out.println("이미 등록된 아이디입니다.");
	      return;
	    }
	
	    dao.insert(vo);
	    System.out.println("등록했습니다.");

  }

}