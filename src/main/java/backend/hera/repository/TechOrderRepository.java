package backend.hera.repository;

import backend.hera.model.TechOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TechOrderRepository extends JpaRepository<TechOrder, Integer> {

    TechOrder findByOrderID(Integer orderId);
    List<TechOrder> findByTechID(Integer techId);
    List<TechOrder> findByCustID(Integer custId);
}
