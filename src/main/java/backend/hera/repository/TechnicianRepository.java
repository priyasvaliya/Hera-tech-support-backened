package backend.hera.repository;

import backend.hera.model.Technician;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicianRepository extends JpaRepository<Technician, Integer> {
	
	@Query(value = "select t.techPassword from Technician t where techUName=?1")
	List<String> findPasswordByUName(String userName);

	Technician findByTechUName(String userName);
	
}
