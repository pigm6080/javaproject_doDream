package caffe_main;

public class CafeMemberDTO {

  private String id;
  private String pwd;
  private String confirmPwd;

  public CafeMemberDTO(String id, String pwd, String confirmPwd) {
    this.id = id;
    this.pwd = pwd;
    this.confirmPwd = confirmPwd;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public String getConfirmPwd() {
    return confirmPwd;
  }

  public void setConfirmPwd(String confirmPwd) {
    this.confirmPwd = confirmPwd;
  }

  public boolean comparePwd() {
    return pwd.equals(confirmPwd);
  }

}