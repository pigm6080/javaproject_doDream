package caffe_main;

public class rootVO {
	
	private String name;
	private static int sum = 0;
	private int price;
	public rootVO(String name, int price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "메뉴는 " + name + ", 가격은 " + price + "입니다.";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getSum() {
		return sum;
	}
	public void addSum(int n) {
		sum += price*n;
	}
	
}
