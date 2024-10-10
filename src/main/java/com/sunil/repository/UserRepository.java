package com.sunil.repository;

import com.sunil.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);

    boolean existsByAccountNumber(String accountNumber);

    User findByAccountNumber(String accountNumber);


     Optional<User> findByEmail(String email);
}
