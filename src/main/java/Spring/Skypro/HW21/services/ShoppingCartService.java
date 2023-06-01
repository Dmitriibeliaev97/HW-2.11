package Spring.Skypro.HW21.services;

import Spring.Skypro.HW21.model.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {
    ShoppingCart addProduct(ShoppingCart productId);

    List<ShoppingCart> getProduct(ShoppingCart productId);

}
