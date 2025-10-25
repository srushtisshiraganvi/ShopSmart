package jsp.shopsmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jsp.shopsmart.model.Product;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>  {
    
}
