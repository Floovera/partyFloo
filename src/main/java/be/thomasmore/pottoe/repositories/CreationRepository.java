package be.thomasmore.pottoe.repositories;

import be.thomasmore.pottoe.model.Creation;
import be.thomasmore.pottoe.model.Set;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CreationRepository extends CrudRepository<Creation,Integer> {

}
