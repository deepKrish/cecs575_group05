package com.ooad.cecs575_group05;

import com.ooad.cecs575_group05.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Cecs575Group05DriverClass {

	public static void main(String[] args) {

		int id = 0101;

		//SINGLETON
		Logger logger1 = Logger.getInstance();
		System.out.println(logger1);
		Logger logger2 = Logger.getInstance();
		System.out.println(logger1);
		System.out.println(logger2);

		//BUILDER
		Product product  = new Product((new Product.ProductBuilder(id)).build());
		System.out.println(product);

		//PROTOTYPE
		Category c1=new Category("Appliances","Kitchen");
		c1.showCategoryRecord();
		System.out.println("\n");
		Category c2=(Category) c1.showCategory();
		c2.showCategoryRecord();
		System.out.println(c1);
		System.out.println(c2);

		//DECORATOR FOR STRUCTURAL PATTERN
		System.out.println("\n");
		System.out.println("Decorator Pattern DEMO");
		UserSubscription goldSubscriptionWithGiftWrap = new GiftWrap(new GoldCategorySubscription());
		String printThis = goldSubscriptionWithGiftWrap.description();
		System.out.println(printThis);

		UserSubscription goldSubscriptionWithGiftWrapAndMessage = new GiftWrap(new AddMessage(new GoldCategorySubscription()));
		String printThisNew = goldSubscriptionWithGiftWrapAndMessage.description();
		System.out.println(printThisNew);


		UserSubscription silverSubscriptionWithGiftWrapAndMessage = new AddMessage(new GiftWrap(new SilverCategorySubscription()));
		String printThisNew1 = silverSubscriptionWithGiftWrapAndMessage.description();
		System.out.println(printThisNew1);

		//VISITOR FOR BEHAVIORAL PATTERN
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("VISITOR FOR BEHAVIORAL PATTERN");
		AcceptVisitor[] items = new AcceptVisitor[]{new LuxuryProduct(1500, "Gold"),
													new LuxuryProduct(900, "Silver"),
													new GroceryProduct(5, 3, "Rice"),
													new GroceryProduct(25, 2, "Avocado")};

		int total = calcPrice(items);
		System.out.println("Final Cost = "+total);


		//STRATEGY FOR BEHAVIORAL PATTERN
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("STRATEGY FOR BEHAVIORAL PATTERN");
		ShoppingCart cart = new ShoppingCart();
		LuxuryProduct prod1 = new LuxuryProduct(2500, "DIAMOND");
		LuxuryProduct prod2 = new LuxuryProduct(1500, "GOLD");
		cart.addItem(prod1);
		cart.addItem(prod2);
		//ONLINE PAYMENT
		cart.payment(new OnlineStrategy("vidyashikhadeepa@example.com", "54321"));
		//DEBIT CARD PAYMENT
		cart.payment(new CardStrategy("Shikha Vidya Deepa", "123456789876543210", "203", "01/27"));
		}


		private static int calcPrice(AcceptVisitor[] items) {
			CartVisitor visitor = new CartVisitorImpl();
			int finalCost=0;
			for(AcceptVisitor item : items){
				finalCost = finalCost + item.accept(visitor);
			}
			return finalCost;
		}

}
