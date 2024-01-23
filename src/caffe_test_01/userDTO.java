package caffe_test_01;

public class userDTO {
	private String userid;
	private String userpw;
	private String pwt;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public userDTO(String userid, String userpw) {
		this.userid = userid;
		this.userpw = userpw;
	}
	public userDTO(String userid, String userpw1,String userpw2) {
		this.userid = userid;
		this.userpw = userpw1;
		this.pwt = userpw2;
	}
	public boolean comparePwd() {
		return userpw.equals(pwt);
	}
	
}
