package Spring.Skypro.HW21.model;

import java.util.Objects;

public class ShoppingCart {
    private final Integer productId;

    public ShoppingCart(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductId() {
        return productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCart that = (ShoppingCart) o;
        return Objects.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "productId=" + productId +
                '}';
    }
}
