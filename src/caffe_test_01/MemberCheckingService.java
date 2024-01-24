package caffe_test_01;

public class MemberCheckingService {
	
    private CafeMemberDAO dao;

    public MemberCheckingService() {
        this.dao = new CafeMemberDAO();
    }

    public boolean checking(String id, String pwd) {
    	
        CafeMemberVO vo = dao.selectOne(id);
        
        if (vo != null && vo.getPwd().equals(pwd)) {
            return true;
        } else {
            return false;
        }
    }
}
