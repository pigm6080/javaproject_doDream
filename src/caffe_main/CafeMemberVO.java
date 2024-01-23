package caffe_main;

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

  @Override
  public String toString() {
    return "MemberVO [name=" + name + ", email=" + email + ", pwd=" + pwd + ", regDate=" + regDate
        + "]";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public Date getRegDate() {
    return regDate;
  }

  public void setRegDate(Date regDate) {
    this.regDate = regDate;
  }
}
