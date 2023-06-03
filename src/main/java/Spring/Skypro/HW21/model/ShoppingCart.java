package Spring.Skypro.HW21.model;

import Spring.Skypro.HW21.impl.ShoppingCartServiceImpl;
import Spring.Skypro.HW21.services.ShoppingCartService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Component
@SessionScope
public class ShoppingCart {
    private final Set<Integer> goods = new HashSet<>();
   public Set<Integer> addProduct(List<Integer> productId){
       goods.addAll(productId);
       return goods;
   }

   public Set<Integer> getProduct(){
       return new HashSet<>(goods);
   }
}
