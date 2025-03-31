package wap.starlistbe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wap.starlistbe.domain.Root;

@Repository
public interface RootRepository extends JpaRepository<Root, Long> {
}
