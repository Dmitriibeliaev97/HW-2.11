package Spring.Skypro.HW21.services;

import Spring.Skypro.HW21.model.ShoppingCart;

import java.util.List;
import java.util.Set;

public interface ShoppingCartService {
    Set<Integer> addProduct(List<Integer> productId);

    Set<Integer> getProduct();

}
