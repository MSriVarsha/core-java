package com.tnsif.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavastreamExample {

	public static void main(String[] args) {
		List<Product> productList=new ArrayList<Product>();
		 productList.add(new Product(1,"hp",25000f));
		 productList.add(new Product(2,"lenova",45000f));
		 productList.add(new Product(3,"apple",95000f));
		 productList.add(new Product(4,"Dell",75000f));
		 
		 List<Float> p1=productList.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
		 System.out.println(p1);
		 
		 double totalprice=productList.stream().collect(Collectors.summingDouble(Product->Product.price));
			System.out.println(totalprice);
			
			// find the maximum product
			
			Product a=productList.stream().max((pro1,pro2)-> pro1.price>pro2.price?1:-1).get();
			System.out.println(a.price);
			// find minimum product
			
			Product r=productList.stream().min((pro1,pro2)-> pro1.price>pro2.price?1:-1).get();
			System.out.println(r.price);
			
			// count() method
			
			long count=productList.stream().filter(product->product.price<5000).count();
			
			System.out.println(count);


	}

}
