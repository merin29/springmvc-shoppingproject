package org.dxc.shopping.service; 
 
import java.util.ArrayList; 
import java.util.List; 
 
import org.dxc.shopping.model.Product; 
import org.springframework.stereotype.Service; 
@Service 
public class ProductService { 
  
 private List<Product> listOfProduct; 
  
 public List<Product> getProduct(){ 
  Product product1=new Product(1,"Pen",20,100.0); 
  Product product2=new Product(2,"Bag",20,4000.0); 
  Product product3=new Product(3,"Pencil",100,100.0); 
  Product product4=new Product(4,"Book",20,1000.0); 
  Product product5=new Product(5,"StoryBook",20,2000.0); 
  listOfProduct=new ArrayList<Product>(); 
  listOfProduct.add(product1); 
  listOfProduct.add(product2); 
  listOfProduct.add(product3); 
  listOfProduct.add(product4); 
  listOfProduct.add(product5); 
  return listOfProduct; 
   
 } 
 
} 