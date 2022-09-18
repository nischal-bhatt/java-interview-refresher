package interview.stuff;

public class GoodCouplingExample {

	public static void main(String[] args) {
		Order order = new Order();
	}
}

class Order
{
	ShoppingCart[] shoppingCarts;
	
	public Order()
	{
		float totalprice=0.0f;
		this.shoppingCarts = new ShoppingCart[2];
		for (int i =0; i<shoppingCarts.length; i++)
		{
			shoppingCarts[i] = new ShoppingCart();
			shoppingCarts[i].setPrice( 2.3f * (i+1));
			shoppingCarts[i].setQuantity ( (i+1));
			
			totalprice = totalprice + shoppingCarts[i].getTotalPrice();
		}
		
		System.out.println(totalprice);
		
	}
}

class ShoppingCart {
	float priceABCDEF = 0.0f;
	int quantity = 0;
	
	public float getTotalPrice()
	{
		return priceABCDEF * quantity * 1.1f;
	}

	public float getPrice() {
		return priceABCDEF;
	}

	public void setPrice(float price) {
		this.priceABCDEF = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
