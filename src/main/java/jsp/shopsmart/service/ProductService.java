package jsp.shopsmart.service;

import jsp.shopsmart.model.Product;
import jsp.shopsmart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    // public List<Product> getAllProducts(String category, String sortBy, String sortDir, int page, int size) {
    //     Sort sort = Sort.by(sortBy);
    //     sort = sortDir.equalsIgnoreCase("desc") ? sort.descending() : sort.ascending();
    //     Pageable pageable = PageRequest.of(page, size, sort);

    //     if (category != null && !category.isEmpty()) {
    //         return repository.findAll(pageable)
    //                 .stream()
    //                 .filter(p -> p.getCategory().equalsIgnoreCase(category))
    //                 .toList();
    //     }

    //     return repository.findAll(pageable).getContent();
    // }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }


    public Product addProduct(Product product) {
        return repository.save(product);
    }

    public Optional<Product> getProductById(Long id) {
        return repository.findById(id);
    }

    public Product updateProduct(Long id, Product updated) {
        return repository.findById(id).map(p -> {
            p.setName(updated.getName());
            p.setCategory(updated.getCategory());
            p.setPrice(updated.getPrice());
            p.setRating(updated.getRating());
            p.setDescription(updated.getDescription());
            return repository.save(p);
        }).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }
}
