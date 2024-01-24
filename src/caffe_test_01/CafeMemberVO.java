package caffe_test_01;

import java.util.Date;

public class CafeMemberVO {

  private String id;
  private String pwd;

  public CafeMemberVO() {
  }

  public CafeMemberVO(String id, String pwd) {
    this.id = id;
    this.pwd = pwd;
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

}
