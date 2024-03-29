package caffe_main;

import java.util.HashMap;
import java.util.Map;

public class CafeMemberDAO {

  private static Map<String, CafeMemberVO> memMap = new HashMap<String, CafeMemberVO>();

  public void insert(CafeMemberVO vo) {
    memMap.put(vo.getId(), vo);
  }
    

  public CafeMemberVO selectOne(String id) {
    return memMap.get(id);
  }

  public void update(CafeMemberVO vo) {
    memMap.put(vo.getId(), vo);
 }

}