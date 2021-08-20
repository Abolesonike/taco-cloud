package fizzy.tacocloud.controller;

import fizzy.tacocloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fizzy.tacocloud.entity.Order;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {
    @Resource
    OrderService orderService;

    @GetMapping("/current")
    public String orderForm(Model model) {
        List<Order> orderList =  orderService.findAllOrder();
        log.info(String.valueOf(orderList));
        model.addAttribute("order", new Order());
        return "orderForm";
    }

    @PostMapping
    public String processOrder(@Valid Order order, Errors errors) {
        if (errors.hasErrors()) {
            return "orderForm";
        }
        log.info("Order submitted:" + order);
        return "redirect:/";
    }
}
