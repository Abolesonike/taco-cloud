package fizzy.tacocloud.data;

import fizzy.tacocloud.entity.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
    List<Order> findByZip(String deliveryZip);
    List<Order> readOrderByZipAndPlacedAtBetween(
            String deliveryZip, Date startDate, Date endDate);
}
