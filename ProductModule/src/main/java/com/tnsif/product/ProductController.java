//Controller Class
package com.tnsif.product;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class ProductController {
	@Autowired
	private ProductService service;

	// RESTful API methods for Retrieval operations
	@GetMapping("/getProduct")
	public List<Product> list() {
		return service.listAll();
	}

	/*
	 * @GetMapping("/getProduct/{id}") public ResponseEntity<Product>
	 * get(@PathVariable Integer id) { try { Product product = service.get(id);
	 * return new ResponseEntity<Product>(product, HttpStatus.OK); } catch
	 * (NoSuchElementException e) { return new
	 * ResponseEntity<Product>(HttpStatus.NOT_FOUND); } }
	 */

	// RESTful API method for Create operation
	@PostMapping("/addProduct")
	public void add(@RequestBody Product product) {
		service.save(product);
	}

	// RESTful API method for Update operation

	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);

	}

	// RESTful API method for Delete operation

	@DeleteMapping("/deleteProduct")
	public void deleteProduct(@RequestParam Integer id) {
		service.deleteProduct(id);
	}

}
