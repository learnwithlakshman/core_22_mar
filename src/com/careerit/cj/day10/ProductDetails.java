package com.careerit.cj.day10;



class Product {

	int pid;
	String pname;
	double price;
	
	public Product(int pid, String pname, double price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
}

public class ProductDetails {
	
	public static void main(String[] args) {
	
			Product p1 = new Product(1001, "Lenovo Thinkpad", 750000);
			Product p2 = new Product(1001, "Lenovo Thinkpad", 750000);
			Product p3 = new Product(1004, "Dell Studio15", 850000);
			Product p4 = new Product(1002, "Sony Studio", 350000);
			Product p5 = new Product(1005, "Dell XPS", 750000);
			
			Product p6 = p1;
			Product[] arr = new Product[] {p1,p2,p3,p4,p5};
			
			
			System.out.println(p1 == p2);
			System.out.println(p1 == p6);
			
			System.out.println(p1.equals(p2));
			System.out.println(p1.equals(p6));
			
			
			//"1001,Lenovo Thinkpad,75000-1002,HP notebook,75000"
			StringBuffer sb = new StringBuffer();
			for(Product p:arr) {
				 sb.append(p.pid)
				   .append(",")
				   .append(p.pname)
				   .append(",")
				   .append(p.price)
				   .append("-");
				
			}
			String str = sb.toString().substring(0,sb.length()-1);
			System.out.println(str);
			
			StringBuilder sb1 = new StringBuilder("Hello");
			StringBuilder sb2 = new StringBuilder("Hello");
			
			System.out.println(sb1 == sb2);
			System.out.println(sb1.equals(sb2));
			
			String str1 = "123219";
			
			System.out.println(isPalindrome(str1));
			
			
	}
	
	private static boolean isPalindrome(String str) {
		return new StringBuilder(str).reverse().toString().equals(str);
	}
}
