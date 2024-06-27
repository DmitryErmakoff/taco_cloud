package sia.taco_cloud.repository;

import org.springframework.data.repository.CrudRepository;
import sia.taco_cloud.entity.Ingredient;

import java.util.Optional;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
