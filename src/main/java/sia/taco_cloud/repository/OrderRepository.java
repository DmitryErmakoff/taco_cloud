package sia.taco_cloud.repository;

import org.springframework.data.repository.CrudRepository;
import sia.taco_cloud.entity.TacoOrder;

import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
