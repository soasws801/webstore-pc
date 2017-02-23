package com.packt.webstore.service;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.packt.webstore.domain.Product;

public interface ProductService {

	List<Product> getAllProducts();

	Product getProductById(String productID);
	
	List<Product> getProductsByCategory(String category);

	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
	
	void addProduct(Product product);
	
	List <Product> getProductsByManufacturer(String manufacturer); //Like in ProductRepository, adding method to get products by manufacturer

	Set<Product> filterProducts(BigDecimal lowPrice, BigDecimal highPrice, String manufacturer, String category);
}
