package backend.hera.controller;

import backend.hera.controller.response.OrderRequestResponse;
import backend.hera.controller.response.OrderResponse;

import backend.hera.model.TechOrder;
import backend.hera.model.Technician;

import backend.hera.repository.TechOrderRepository;
import backend.hera.repository.TechnicianRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@RestController
@RequestMapping("/order")
public class TechOrderController {

    private final TechOrderRepository techOrderRepository;
    private final TechnicianRepository technicianRepository;

    public TechOrderController(TechOrderRepository techOrderRepository, TechnicianRepository technicianRepository, TechOrderRepository orderRepository) {
        this.techOrderRepository = techOrderRepository;
        this.technicianRepository = technicianRepository;
        this.orderRepository = orderRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderResponse> getOrderPaymentResponse(@PathVariable Integer id) {
        OrderResponse orderResponse = new OrderResponse();
        TechOrder techOrder = techOrderRepository.findByOrderID(id);
        Technician technician = technicianRepository.getById(techOrder.getTechID());
        Double hours = Double.valueOf(ChronoUnit.MINUTES.between(techOrder.getOrderEndDate(), techOrder.getOrderStartDate()))/60;
        Double calculatedAmount = hours*technician.getTechPaymentRate();
        Double taxableAmount = 0.2 * calculatedAmount;


        orderResponse.setId(techOrder.getOrderID());
        orderResponse.setOrderDesc(techOrder.getOrderDesc());
        orderResponse.setPaymentRate(technician.getTechPaymentRate());
        orderResponse.setHours(hours);
        orderResponse.setTaxAmount(taxableAmount);
        orderResponse.setAmountToPay(calculatedAmount + taxableAmount);
        return ResponseEntity.ok().body(orderResponse);
    }

    @PostMapping("/{id}")
    public void setPayment(@PathVariable Integer id) {
        TechOrder techOrder = techOrderRepository.getById(id);
        techOrder.setOrderPaid(true);
        techOrderRepository.save(techOrder);
    }

    @PostMapping("/complete/{id}")
    public void setCompleted(@PathVariable Integer id) {
        TechOrder techOrder = techOrderRepository.getById(id);
        techOrder.setOrderStatus(true);
        techOrder.setOrderEndDate(LocalDateTime.now());
        techOrderRepository.save(techOrder);
    }

    private final TechOrderRepository orderRepository;




//    @GetMapping("/{id}")
//    public ResponseEntity<Object> getOrderRequestResponse(@PathVariable Integer id) {
//        OrderRequestResponse orderRequestResponse = new OrderRequestResponse();
//        Technician technician = technicianRepository.getById(techOrder.getTechID());
//        Customer customer = customerRepository.getById(customer.getCustID());
//
//
//        orderRequestResponse.setTechID(technician.getTechID().toString());
//        orderRequestResponse.setOrderDesc(orderRequest.getOrderDesc());
//        orderRequestResponse.setOrderAddress(orderRequest.getOrderAddress());
//        orderRequestResponse.setOrderStartDate(orderRequest.getOrderStartDate());
//
//        return ResponseEntity.ok().body(orderRequestResponse);
//    }

    @PostMapping
    public void createOrderRequest(@RequestBody OrderRequestResponse orderRequest) {

        //TODO: Fix date issue here
        orderRepository.save(new TechOrder(0, orderRequest.getCustID(), orderRequest.getTechID(), orderRequest.getOrderDesc(), false, orderRequest.getOrderStartDate(), orderRequest.getOrderStartDate(), false,  orderRequest.getOrderAddress()));
    }

}
