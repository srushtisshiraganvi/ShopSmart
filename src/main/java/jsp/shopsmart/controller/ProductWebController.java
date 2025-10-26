package jsp.shopsmart.controller;

import jsp.shopsmart.model.Product;
import jsp.shopsmart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductWebController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "index";  // will load index.html
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("product", new Product());
        return "add-product";
    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute Product product) {
        productService.addProduct(product);
        return "redirect:/";
    }

   @GetMapping("/edit/{id}")
public String showEditForm(@PathVariable("id") Long id, Model model) {
    Product product = productService.getProductById(id)
            .orElseThrow(() -> new RuntimeException("Product not found"));
    model.addAttribute("product", product);
    return "edit-product";
}

@PostMapping("/update/{id}")
public String updateProduct(@PathVariable("id") Long id, @ModelAttribute Product product) {
    productService.updateProduct(id, product);
    return "redirect:/";
}

@GetMapping("/delete/{id}")
public String deleteProduct(@PathVariable("id") Long id) {
    productService.deleteProduct(id);
    return "redirect:/";
}

}
