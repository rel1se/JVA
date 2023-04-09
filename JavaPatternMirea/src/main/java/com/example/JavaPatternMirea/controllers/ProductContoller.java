package com.example.JavaPatternMirea.controllers;

import lombok.RequiredArgsConstructor;
import com.example.JavaPatternMirea.models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.JavaPatternMirea.services.MarketService;
import com.example.JavaPatternMirea.services.ProductService;

import java.util.List;

@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductContoller {
    private final ProductService productService;
    private final MarketService marketService;

    @GetMapping("/add")
    public String createProduct(@RequestParam(value = "name") String name,
                                @RequestParam(value = "price") int price,
                                Model model){
        Product product = new Product(name,price);
//        long num = product.getNumber();
        char firstDigitCard = String.valueOf(product.getName()).charAt(0);
        if (firstDigitCard == '1') {
            if (marketService.existsMarket("Perekrestok", "Moscow")) product.setMarket(marketService.getMarket("Perekrestok", "Moscow"));
            else product.setMarket(null);
        } else if (firstDigitCard == '2') {
            if (marketService.existsMarket("Diksi", "Moscow")) product.setMarket(marketService.getMarket("Diksi", "Moscow"));
            else product.setMarket(null);
        } else if (firstDigitCard == '3') {
            if (marketService.existsMarket("Slata", "Irkustk")) product.setMarket(marketService.getMarket("Slata", "Irkustk"));
            else product.setMarket(null);
        }
        if (!productService.existsProduct(name, price)) productService.addProduct(product);
        System.out.println("Added product: " + product);
        model.addAttribute("type", "add product");
        model.addAttribute("data", productService.getProduct(name, price));
        return "product";
    }
    @GetMapping("/delete")
    public String deleteProduct(@RequestParam(value = "name") String name,
                                @RequestParam(value = "price") int price,
                                Model model){
        model.addAttribute("type", "delete product");
        Product product = productService.getProduct(name,price);
        productService.deleteProduct(name,price);
        System.out.println("Removed product" + product);
        model.addAttribute("data", product);
        return "product";
    }
    @GetMapping("/show")
    public String showProducts(Model model){
        model.addAttribute("type", "show cards");
        List<Product> products = productService.showProduct();
        if (products.isEmpty()) {
            model.addAttribute("data", "empty");
        } else {
            model.addAttribute("products", products);
        }
        System.out.println("All products: ");
        int cnt = 0;
        for (Product product : products) {
            System.out.println(++cnt + ". " + product);
        }
        return "product";
    }
}
