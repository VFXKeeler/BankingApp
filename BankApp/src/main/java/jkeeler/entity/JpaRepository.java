package jkeeler.Repository;
//import org.springframework.data.jpa.repository.JpaRepository;
import jkeeler.entity.UserAccount;

public interface Repository {
    UserAccount findByUsername(String username);
}
