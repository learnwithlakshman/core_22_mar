package com.careerit.cj.day13;

import static com.careerit.cj.day13.ApplicationConstantMessageService.LABEL_NAME;
import static com.careerit.cj.day13.ApplicationConstantMessageService.LABEL_PASS;
import static com.careerit.cj.day13.ApplicationConstantMessageService.LABEL_SUB_BTN;
import static java.lang.Math.PI;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.System.out;



class One {
	public void m1() {
		System.out.println("M1");
	}
	static class Inner{
		
	}
}

class Two extends One {
	public void m1() {
		System.out.println("M>>>M1");
	}
}

class Product {

	private int pid;
	private String name;
	private double price;
	private double discount;
	private static int count = 0;

	private final static int MAX_ORDER_COUNT;
	private final int DAYS_IN_WEEK;

	{
		DAYS_IN_WEEK = 7;
		System.out.println("IIB-1");
		count++;
	}

	static {
		MAX_ORDER_COUNT = 5; // Logic get max count value
		System.out.println("Static-block-1");
	}

	public Product(int pid, String name, double price) {
		this.pid = pid;
		this.name = name;
		this.price = price;

	}

	public Product(int pid, String name, double discount, double price) {
		this.pid = pid;
		this.name = name;
		this.price = price;

	}

	public void showInfo() {
		System.out.println(String.format("%s - %s -%s - %s", pid, name, discount, price));
	}

	public static int getCounter() {
		return count;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Product.count = count;
	}

}

public class StaticManager {

	public static Product changePrice(final Product product) {
		// product = new Product(1, "A", 889);
		product.setPrice(product.getPrice() - 1000);
		// product = new Product(product.getPid(),
		// product.getName(),product.getPrice()-1000);
		return product;
	}

	public static void main(final String[] args) {
		// args = new String[] {};
		// args[0] = "Modified value";
		Product p1 = new Product(1001, "Lenovo Thinkpad", 45000);
		Product p3 = new Product(1002, "Lenovo Thinkpad", 45000);
		System.out.println(Product.getCounter());
		Product p2 = new Product(1003, "Lenovo Thinkpad", 500, 45000);
		Product p5 = new Product(1004, "Lenovo Thinkpad", 45000);
		System.out.println(Product.getCounter());

		p1.showInfo();
		p1 = changePrice(p1);
		out.println(p1);
		p1.showInfo();

		out.println(PI);
		out.println(sqrt(9));
		out.println(abs(3.5));

		System.out.println(LABEL_NAME);
		System.out.println(LABEL_PASS);
		System.out.println(LABEL_SUB_BTN);
		System.out.println("Welcome to java world");
		System.err.println("Welcome to java world");
	}
}
