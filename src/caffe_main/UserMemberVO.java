package caffe_main;

public class UserMemberVO {
    private String name;
    private String price;
    private String paymentMethod;
    
    public UserMemberVO() {
    	
    }
    
    public UserMemberVO(String name, String price, String paymentMethod) {
    	this.name = name;
    	this.price = price;
    	this.paymentMethod = paymentMethod;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
       
}
