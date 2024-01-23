package caffe_test_01;

import java.util.HashMap;
import java.util.Map;

public class userDAO {
	
	private static Map<String , String> userMap = new HashMap<String, String>();
	
	public void insert(userVO vo) {
		userMap.put(vo.getUserid(), vo.getUserpw());
	}
	
	public String selectOne(String id) {
		return userMap.get(id);
	}
	
	
}
