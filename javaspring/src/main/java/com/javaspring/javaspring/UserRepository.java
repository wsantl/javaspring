package com.javaspring.javaspring;
import org.springframework.data.jpa.repository.JpaRepository;
import com.javaspring.javaspring.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}