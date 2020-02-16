package com.project.sms.mapper;

import com.project.sms.Bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {}
