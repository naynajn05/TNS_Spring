//Service class
package com.tnsif.product;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductRepository repo;

	//retrieve all
	public List<Product> listAll() {
		return repo.findAll();
	}

	//create
	public void save(Product product) {
		repo.save(product);
	}

	// update
	public Product updateProduct(Product product) {
		Integer id = product.getId();

		Product pro = repo.findById(id).get();
		pro.setName(product.getName());
		pro.setBrand(product.getBrand());
		pro.setPrice(product.getPrice());
		return repo.save(pro);

	}

	//retrieve single data
	public Product get(Integer id) {
		return repo.findById(id).get();
	}

	//delete
	public void deleteProduct(Integer id) {
		repo.deleteById(id);
	}

}
