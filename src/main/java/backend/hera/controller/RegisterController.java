package backend.hera.controller;

import backend.hera.model.Customer;
import backend.hera.model.Technician;
import backend.hera.controller.response.RegisterResponse;
import backend.hera.repository.TechnicianRepository;
import backend.hera.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
    private TechnicianRepository technicianRepository;
	
	@PostMapping
	public void createCustomer(@RequestBody RegisterResponse register) {
		System.out.print(register.getFirstName());
		if (register.getIdentity() == 0) {
			customerRepository.save(new Customer(0, register.getUserName(), register.getFirstName(), register.getLastName(), register.getPayment(), register.getAddress(), register.getPassword(), 5));
		} else {
			technicianRepository.save(new Technician(0, register.getUserName(), register.getFirstName(), register.getLastName(), register.getPayment(), register.getPassword(), register.getAddress(), 5, 15));
		}
	}
}
