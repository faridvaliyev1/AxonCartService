package farid.axon.cart.coreapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Map;
import java.util.UUID;

@Entity
public class FoodCart {

    @Id
    @GeneratedValue
    private UUID cartId;
    private Map<UUID,Integer> products;
}
