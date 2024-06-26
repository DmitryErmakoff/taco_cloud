package sia.taco_cloud.repository;

import sia.taco_cloud.entity.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
