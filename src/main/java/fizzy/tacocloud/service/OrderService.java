package fizzy.tacocloud.service;

import fizzy.tacocloud.entity.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderService {
    @Resource
    private OrderService orderService;

    public Order insertOrder(Order order){
        return orderService.insertOrder(order);
    }


    public void deleteOrder(Long id) {
        orderService.deleteOrder(id);
    }


    public Order findOrderById(Long id){
        return orderService.findOrderById(id);
    }


    public List<Order> findAllOrder() {
        return orderService.findAllOrder();
    }


    public Order updateOrder(Order order) {
        return orderService.insertOrder(order);
    }
}
