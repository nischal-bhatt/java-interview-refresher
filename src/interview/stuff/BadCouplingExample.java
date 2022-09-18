package interview.stuff;

public class BadCouplingExample {

	public static void main(String[] args) {
		Order order = new Order();
	}
}

class BadOrder
{
	BadShoppingCart[] BadshoppingCarts;
	
	public BadOrder()
	{
		float totalprice=0.0f;
		this.BadshoppingCarts = new BadShoppingCart[2];
		for (int i =0; i<this.BadshoppingCarts.length; i++)
		{
			BadshoppingCarts[i] = new BadShoppingCart();
			BadshoppingCarts[i].price = 2.3f * (i+1);
			BadshoppingCarts[i].quantity = (i+1);
			
			totalprice = totalprice + BadshoppingCarts[i].getTotalPrice();
		}
		
		System.out.println(totalprice);
		
	}
}

class BadShoppingCart {
	float price = 0.0f;
	//lets say we want to change the name of price, then we also have to change it in above BadOrder
	int quantity = 0;
	
	
	public float getTotalPrice()
	{
		return price * quantity * 1.1f;
	}
	
}
