package Spring.Skypro.HW21.impl;

import Spring.Skypro.HW21.model.ShoppingCart;
import Spring.Skypro.HW21.services.ShoppingCartService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@Scope("prototype")
public class ShoppingCartServiceImpl implements ShoppingCartService {


    public final ShoppingCartService shoppingCartService;

    public ShoppingCartServiceImpl(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @Override
    public ShoppingCart addProduct(ShoppingCart productId) {
        return productId;
    }

    @Override
    public List<ShoppingCart> getProduct(ShoppingCart productId) {
        return Collections.singletonList((ShoppingCart) shoppingCartService.getProduct(productId));
    }
}
