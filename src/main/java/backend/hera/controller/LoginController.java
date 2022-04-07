package backend.hera.controller;

import backend.hera.controller.response.UserResponse;
import backend.hera.model.Customer;
import backend.hera.model.Technician;
import backend.hera.repository.TechnicianRepository;
import backend.hera.repository.CustomerRepository;
import backend.hera.controller.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
    private TechnicianRepository technicianRepository;
	
	@PostMapping
	public UserResponse loginCustomer(@RequestBody LoginResponse login) {
		String password;
		List<String> output;
		UserResponse userResponse;

		if (login.getIdentity() == 0) {
			output = customerRepository.findPasswordByUName(login.getUserName());
			Customer customer = customerRepository.findByCustUName(login.getUserName());
			userResponse = new UserResponse(customer.getcustID(), customer.getcustUserName(), customer.getcustFName(),
					customer.getcustLName(), customer.getcustRating());


		} else {
			output = technicianRepository.findPasswordByUName(login.getUserName());
			Technician technician = technicianRepository.findByTechUName(login.getUserName());
			userResponse = new UserResponse(technician.getTechID(), technician.getTechUserName(), technician.getTechFName(),
					technician.getTechLName(), technician.getTechRating());
		}
		if (output.size() == 0) {
			return null;
		}
		password = output.get(0);
		if (password.equals(login.getPassword())) {
			return userResponse;
		} else {
			return null;
		}
	}

	@GetMapping("/{id}")
	public UserResponse getCustomer(@PathVariable Integer id) {
		Customer customer = customerRepository.findById(id).get();
		return new UserResponse(customer.getcustID(), customer.getcustUserName(), customer.getcustFName(),
				customer.getcustLName(), customer.getcustRating());
	}
	
}
