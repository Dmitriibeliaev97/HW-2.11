package Spring.Skypro.HW21.controllers;

import Spring.Skypro.HW21.model.ShoppingCart;
import Spring.Skypro.HW21.services.ShoppingCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store/order/")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/add")
    public ShoppingCart addProduct(@RequestParam("productId") ShoppingCart productId) {
        return shoppingCartService.addProduct(productId);
    }


    @GetMapping("/get")
    public ShoppingCart getProduct(@RequestParam("productId") ShoppingCart productId) {
        return (ShoppingCart) shoppingCartService.getProduct(productId);
    }

}
