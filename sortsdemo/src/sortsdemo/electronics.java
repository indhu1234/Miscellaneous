package sortsdemo;

public class electronics 
{
   private String brand;
   private int qty;
   private double price;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public electronics(String brand, int qty, double price) {
	//super();
	this.brand = brand;
	this.qty = qty;
	this.price = price;
}
@Override
public String toString() {
	return "electronics [brand=" + brand + ", qty=" + qty + ", price=" + price + "]";
}
   
   
}
