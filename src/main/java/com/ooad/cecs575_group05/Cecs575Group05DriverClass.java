package com.ooad.cecs575_group05;

import com.ooad.cecs575_group05.model.Category;
import com.ooad.cecs575_group05.model.Logger;
import com.ooad.cecs575_group05.model.Product;
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
	}

}
