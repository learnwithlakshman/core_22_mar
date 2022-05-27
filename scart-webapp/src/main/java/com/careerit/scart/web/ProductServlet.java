package com.careerit.scart.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.careerit.scart.domain.Product;
import com.careerit.scart.service.ProductService;
import com.careerit.scart.service.ProductServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ProductService productService = new ProductServiceImpl();   
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		response.setContentType("text/html");
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Team Information</title>");
        out.println("</head>");
        if(uri.endsWith("viewproducts.do")) {
        	List<Product> prouductList = productService.getProducts();
        	out.println("<table border='1'>");
            out.println("<tr><th>#</th><th>Name</th><th>Price</th><th>Edit</th><th>Delete</th><th>More</th></tr>");
            for(Product product:prouductList) {
               	out.print("<tr>");
            	out.print("<td>"+product.getPid()+"</td>");
            	out.print("<td>"+product.getName()+"</td>");
            	out.print("<td>"+product.getPrice()+"</td>");
              	out.print("<td><a href=editproduct.do?pid="+product.getPid()+">Edit</td>");
            	out.print("<td><a href=deleteproduct.do?pid="+product.getPid()+">Delete</td>");
            	out.print("<td><a href=viewproduct.do?pid="+product.getPid()+">More..</td>");
            	out.print("</tr>");
            }
            out.println("</table>");
		}else if(uri.endsWith("editproduct.do")) {
			String str = request.getParameter("pid");
			if(str!=null) {
				Long pid=Long.parseLong(str);
				//Call to service
				Product product = productService.getProduct(pid);
			}
		}
        else if(uri.endsWith("updateproduct.do")) {
			 
		}else if(uri.endsWith("searchproduct.do")) {
			
		}else if(uri.endsWith("deleteproduct.do")) {
			
		}
        out.println("<a href='index.html'>Home</a>");
        out.println("</body>");
        out.println("</html>");
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	
}
