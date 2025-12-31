package com.vacheronpradelalyssa.portfolio.repository;

import com.vacheronpradelalyssa.portfolio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}