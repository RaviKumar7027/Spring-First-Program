


package io.spings.Ravi.repository;

import io.spings.Ravi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Here you can add custom queries if needed.
}
