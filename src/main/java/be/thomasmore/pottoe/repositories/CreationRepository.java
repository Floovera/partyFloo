package be.thomasmore.pottoe.repositories;

import be.thomasmore.pottoe.model.Creation;
import be.thomasmore.pottoe.model.Creator;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CreationRepository extends CrudRepository<Creation,Integer> {
    Iterable<Creation> findByCreator(Creator creator);

    List<Creation> findAllBy();

    @Query("select c from Creation c WHERE :type IS NULL OR (UPPER(c.type) LIKE UPPER(CONCAT('%', :type, '%')))")
    List<Creation> findByType(@Param("type")String type);
}
