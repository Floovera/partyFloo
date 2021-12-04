package be.thomasmore.pottoe.repositories;

import be.thomasmore.pottoe.model.Set;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SetRepository extends CrudRepository<Set,Integer> {
    List<Set> findAllBy();

    @Query("select s from Set s WHERE :type IS NULL OR (UPPER(s.type) LIKE UPPER(CONCAT('%', :type, '%')))")
    List<Set> findByType(@Param("type")String type);
}
