package jkeeler.App.RelationMapping;

import jkeeler.App.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository<T,Long> extends JpaRepository<UserAccount, Long> {
}
