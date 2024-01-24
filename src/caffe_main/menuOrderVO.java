package caffe_main;

public class menuOrderVO {
	
	private String name;
	private String price;
	public menuOrderVO(String name, String price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "menuOrderVO [name=" + name + ", price=" + price + "]";
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

}
