package common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("search/{pageNumber}/{pageSize}")
    public Page<Product> search(@RequestBody Product product, @PathVariable("pageNumber") int pageNumber, @PathVariable("pageSize") int pagesize) {

        return service.productSearch(product, pageNumber, pagesize);
    }
}
