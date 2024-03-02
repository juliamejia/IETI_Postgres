package edu.eci.ieti.postgres.repository;

import edu.eci.ieti.postgres.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
