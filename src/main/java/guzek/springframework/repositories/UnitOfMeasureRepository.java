package guzek.springframework.repositories;

import guzek.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Pawel on 15.04.2018.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
}
