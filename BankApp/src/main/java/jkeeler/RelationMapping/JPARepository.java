package jkeeler.RelationMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JPARepository<T, ID> extends JpaRepository<T, ID> {
}
