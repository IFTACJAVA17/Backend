package se.iftac.iftacgames.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.iftac.iftacgames.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
