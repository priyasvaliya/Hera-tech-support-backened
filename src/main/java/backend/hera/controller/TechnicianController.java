package backend.hera.controller;

import backend.hera.controller.response.TechOrderResponse;
import backend.hera.model.Customer;
import backend.hera.model.TechOrder;
import backend.hera.model.Technician;
import backend.hera.repository.CustomerRepository;
import backend.hera.repository.TechOrderRepository;
import backend.hera.repository.TechnicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/technician")
public class TechnicianController {

    @Autowired
    private TechnicianRepository technicianRepository;

    @Autowired
    private TechOrderRepository techOrderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public ResponseEntity<List<Technician>> getTechnicians() {
        List<Technician> technicians = technicianRepository.findAll();
        return ResponseEntity.ok().body(technicians);
    }

    @GetMapping("/orders/{id}")
    public ResponseEntity<List<TechOrderResponse>> getOrdersForTechnician(@PathVariable Integer id) {
        List<TechOrder> orders = techOrderRepository.findByTechID(id);
        Technician technician = technicianRepository.findById(id).get();
        List<TechOrderResponse> techOrderResponses = orders.stream().map(
                order -> {
                    TechOrderResponse techOrderResponse = new TechOrderResponse();
                    Customer customer = customerRepository.findById(order.getCustID()).get();
                    techOrderResponse.setOrderID(order.getOrderID());
                    techOrderResponse.setCustFName(customer.getcustFName());
                    techOrderResponse.setCustLName(customer.getcustLName());
                    techOrderResponse.setOrderStartDate(order.getOrderStartDate().toString());
                    techOrderResponse.setCustAddress(order.getOrderAddress());
                    techOrderResponse.setCompleted(order.getOrderStatus() ? "Yes" : "No");
                    return techOrderResponse;
                }
        ).collect(Collectors.toList());
        return ResponseEntity.ok().body(techOrderResponses);
    }

    @GetMapping("/orderhistory/{id}")
    public ResponseEntity<List<TechOrderResponse>> getOrdersForCustomer(@PathVariable Integer id) {
        List<TechOrder> orders = techOrderRepository.findByCustID(id);
        Customer customer = customerRepository.findById(id).get();
        List<TechOrderResponse> techOrderResponses = orders.stream()
                .map(
                order -> {
                    TechOrderResponse techOrderResponse = new TechOrderResponse();
                    Technician technician = technicianRepository.findById(order.getTechID()).get();
                    techOrderResponse.setOrderID(order.getOrderID());
                    techOrderResponse.setTechFName(technician.getTechFName());
                    techOrderResponse.setTechLName(technician.getTechLName());
                    techOrderResponse.setOrderStartDate(order.getOrderStartDate().toString());
                    techOrderResponse.setOrderEndDate(order.getOrderEndDate() == null ? "" : order.getOrderEndDate().toString());
                    techOrderResponse.setCustAddress(order.getOrderAddress());
                    techOrderResponse.setCompleted(order.getOrderStatus() ? "Yes" : "No");
                    techOrderResponse.setPaid(order.getOrderPaid() ? "Yes" : "No");
                    return techOrderResponse;
                }
        ).collect(Collectors.toList());
        return ResponseEntity.ok().body(techOrderResponses);
    }

}
