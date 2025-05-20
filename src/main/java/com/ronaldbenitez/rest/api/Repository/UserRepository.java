package com.ronaldbenitez.rest.api.Repository;

import com.ronaldbenitez.rest.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

