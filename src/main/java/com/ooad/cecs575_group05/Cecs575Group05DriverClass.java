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

	}

}
