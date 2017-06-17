package com.mobitel.MobitelBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mobitel.MobitelBackend.dao.ProductDAO;
import com.mobitel.MobitelBackend.model.Product;

public class ProductTestCase {

	
	public static void main(String arg[])
	{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.mobitel.MobitelBackend");
		
		context.refresh();
		
		// Inserting a Product Object.
		ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
		
		//Insertion TestCase
		
		Product product=new Product();
		
		product.setCatid(12);
		product.setPrice(7600);
		product.setQuantity(1);
		product.setSuppid(132);
		product.setProdname("WIFIMobile");
		product.setProdesc("This Mobile is WIFI Enabled. You can Enjoy Internet");

		productDAO.insertUpdateProduct(product);		
		System.out.println("Product Inserted");
		
		//Retrieval TestCase`
		
		/*Product product=productDAO.getProduct(2);
		System.out.println("Product Name:"+product.getCatname());
		System.out.println("Product Description:"+product.getCatdesc());*/
		
		//Deletion TestCase
		/*Product product=productDAO.getProduct(2);
		productDAO.deleteProduct(product);
		System.out.println("The Product Deleted");*/
		
		//Retrieving the Data
		
		/*List<Product> list=productDAO.getProductDetails();
		
		for(Product product:list)
		{
			System.out.println(product.getCatid()+":"+product.getCatname()+":"+product.getCatdesc());
		}*/
		
		//Update the Product
		//Product product=productDAO.getProduct(3);
		//product.setCatname("WifiEnMobile");
		//productDAO.insertUpdateProduct(product);
		//System.out.println("The Product Updated");
	}

}
