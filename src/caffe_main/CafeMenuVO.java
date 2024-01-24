package caffe_main;

public class CafeMenuVO {
    private String name;
    private int price;
    
   public CafeMenuVO(String name, int price) {
      this.name = name;
      this.price = price;
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
   @Override
   public String toString() {
      return "CafeMenuVO [name=" + name + ", price=" + price + "]";
   }
    
    
}