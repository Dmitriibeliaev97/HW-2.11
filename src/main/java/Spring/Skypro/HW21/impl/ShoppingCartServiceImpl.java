package Spring.Skypro.HW21.impl;

import Spring.Skypro.HW21.model.ShoppingCart;
import Spring.Skypro.HW21.services.ShoppingCartService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private final ShoppingCart shoppingCart;

    public ShoppingCartServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }


    @Override
    public Set<Integer> addProduct(List<Integer> productId) {
        return shoppingCart.addProduct(productId);
    }

    @Override
    public Set<Integer> getProduct() {
        return shoppingCart.getProduct();
    }


}
