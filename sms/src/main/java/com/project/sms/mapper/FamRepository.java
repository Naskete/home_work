package com.project.sms.mapper;

import com.project.sms.Bean.Familier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FamRepository extends JpaRepository<Familier,Integer> {
    @Query("select s from Familier s where s.name=?1")
    List<Familier> findFamilier(String name);
}
