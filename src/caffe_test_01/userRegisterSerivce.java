package caffe_test_01;

public class userRegisterSerivce {
	private userDAO dao;
	
	public userRegisterSerivce() {
		dao = new userDAO();
	}
	public void regist(userDTO dto) {
		
		userVO vo = new userVO(dto.getUserid(),dto.getUserpw());

		dao.insert(vo);
		System.out.println("등록되었습니다.");
	}
}
