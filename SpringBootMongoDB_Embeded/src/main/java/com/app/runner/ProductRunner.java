package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.document.Product;
import com.app.repo.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner{
	
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		repo.deleteAll();
		repo.save(new Product("101",10,"mobile",567.68));
		repo.save(new Product("102",11,"laptop",867.68));
		repo.save(new Product("103",12,"computer",967.68));
		repo.save(new Product("104",10,"mobile",567.68));
		repo.save(new Product("105",11,"laptop",867.68));
		repo.save(new Product("106",12,"computer",967.68));
		
		System.out.println("---------------------");
		repo.findAll().forEach(System.out::println);
		
	}
	
	

}
