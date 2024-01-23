package caffe_test_01;

public class userVO {
	
	private String userid;
	private String userpw;
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
	public userVO(String userid, String userpw) {
		this.userid = userid;
		this.userpw = userpw;
	}
	
	
}
