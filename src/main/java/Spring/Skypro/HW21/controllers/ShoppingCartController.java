package Spring.Skypro.HW21.controllers;

import Spring.Skypro.HW21.model.ShoppingCart;
import Spring.Skypro.HW21.services.ShoppingCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/add")
    public Set<Integer> addProduct(@RequestParam List<Integer> productId) {
        return shoppingCartService.addProduct(productId);
    }


    @GetMapping("/get")
    public Set<Integer> getProduct() {
        return shoppingCartService.getProduct();
    }

}
