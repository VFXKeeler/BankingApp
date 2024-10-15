package jkeeler.App.RelationMapping;

import jkeeler.App.Entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository<T,Long> extends JpaRepository<UserAccount, Long> {

    UserAccount findByUsername(String username);
}
