package eventstorming.external;

import java.util.Date;
import lombok.Data;

@Data
public class Order {

    private Long id;
    private Long productid;
    private Integer qty;
    private Long customerid;
    private Integer amount;
}
