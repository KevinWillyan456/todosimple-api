package com.kevinsouza.todosimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kevinsouza.todosimple.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
