package caffe_main;

public class MemberChangePasswordService {

   private CafeMemberDAO dao;
   
   public MemberChangePasswordService() {
      this.dao = new CafeMemberDAO();
   }

   public void changePassword(String[] userInputs) {
      String id = userInputs[0];
      String oldPwd = userInputs[1];
      String newPwd = userInputs[2];
      
      CafeMemberVO vo = dao.selectOne(id);
      if(vo==null) {
         System.out.println("입력한 id와 일치하는 회원정보가 없습니다.");
         return;
      }
      
      if(vo.getPwd().equals(oldPwd)) {
         vo.setPwd(newPwd);
      }else {
         System.out.println("입력한 비번이 일치하지 않습니다.");
         return;
      }
      
      dao.update(vo);
      
   }

}