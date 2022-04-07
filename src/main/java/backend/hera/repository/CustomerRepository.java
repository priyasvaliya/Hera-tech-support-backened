package backend.hera.repository;

import backend.hera.model.Customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	@Query(value = "select c.custPassword from Customer c where custUName=?1")
	List<String> findPasswordByUName(String userName);

	Customer findByCustUName(String userName);
	
}
