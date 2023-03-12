package com.springproject.crudwebapp.repository;

import com.springproject.crudwebapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
