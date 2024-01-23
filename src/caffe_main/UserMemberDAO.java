package caffe_main;

import java.util.HashMap;

import java.util.Map;


public class UserMemberDAO {

	private static Map<String, UserMemberVO> memMap = new HashMap<String, UserMemberVO>();

	public void insert(UserMemberVO vo) {
		memMap.put(vo.getPrice(), vo);
	}

}
