//import required packages here
import java.util.*;

class Item
{
  private int price;
  public void setPrice(int price)
  {
  	this.price = price;
  }
  public int getPrice()
  {
      return price;
  }
}
   
class Customer extends Item
{
  private String product;
  private int quantity;
  public void setProduct(String product)
  {
      this.product = product;
  }
  public String getProduct()
  {
      return product;
  }
  public void setQuantity(int quantity)
  {
      this.quantity = quantity;
  }
  public int getQuantity()
  {
      return quantity;
  }
}

class Bill extends Customer
{
  public int getAmount(int price , int qty)
  {
      return price * qty;
  }
}
class Main
{
  public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);
    String product = sc.next();
    int price = sc.nextInt();
    int quantity = sc.nextInt();
    Item i = new Item();
    Customer c = new Customer();
    i.setPrice(price);
    c.setQuantity(quantity);
    int q= c.getQuantity();
    int p =i.getPrice();
    Bill obj = new Bill();
    int r = obj.getAmount(p,q);
    System.out.println("Total Price is : " + r);
  }
}