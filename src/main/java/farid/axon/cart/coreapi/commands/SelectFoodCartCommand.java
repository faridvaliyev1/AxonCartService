package farid.axon.cart.coreapi.commands;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SelectFoodCartCommand {
    @TargetAggregateIdentifier
    private UUID foodCartId;

    private UUID productId;
    private Integer quantity;
}
