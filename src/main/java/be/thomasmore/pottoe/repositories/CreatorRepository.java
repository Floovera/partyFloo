package be.thomasmore.pottoe.repositories;

import be.thomasmore.pottoe.model.Creator;
import be.thomasmore.pottoe.model.Set;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CreatorRepository extends CrudRepository<Creator,Integer> {

}
