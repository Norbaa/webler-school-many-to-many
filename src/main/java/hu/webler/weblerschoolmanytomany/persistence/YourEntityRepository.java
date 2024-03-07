package hu.webler.weblerschoolmanytomany.persistence;

import hu.webler.weblerschoolmanytomany.entity.base.YourEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YourEntityRepository extends JpaRepository<YourEntity, Long> {
}
