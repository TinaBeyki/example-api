package common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;


@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Page<Product> productSearch(Product product, int pageNumber, int pageSize) {

        Product.builder()
                .name(product.getName())
                .code(product.getCode())
                .fromDate(product.getFromDate())
                .toDate(product.getToDate())
                .build();


        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String s = simpleDateFormat.format(product.getFromDate());
        System.out.println(s);

        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        /*
        matchingAll  == matching -> and
        matchingAny -> or
         */

        /*repository.findAll(Example.of(product, ExampleMatcher.matchingAny()));*/
        return repository.findAll(Example.of(product, ExampleMatcher.matchingAny()), pageable);
    }

}
