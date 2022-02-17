package mx.edu.utez.marketplace.subcategory.model;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SubcategoryRepository extends JpaRepository<Subcategory,Long> {
    Optional<Subcategory> findByDescription(String description);
    boolean existsById(long id);
    List<Subcategory> findAllByCategoryId(long id);
}
