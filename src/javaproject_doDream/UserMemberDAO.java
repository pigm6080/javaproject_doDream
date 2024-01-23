package cafeProject;

import java.util.HashMap;
import java.util.Map;

import member_ver1.MemberVO;

public class UserMemberDAO {

	private static Map<String, UserMemberVO> memMap = new HashMap<String, UserMemberVO>();

	public void insert(UserMemberVO vo) {
		memMap.put(vo.getPrice(), vo);
	}

}
