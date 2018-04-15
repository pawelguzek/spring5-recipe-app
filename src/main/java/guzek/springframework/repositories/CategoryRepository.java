package guzek.springframework.repositories;

import guzek.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Pawel on 15.04.2018.
 */
public interface CategoryRepository extends CrudRepository<Category, Long>{
}
