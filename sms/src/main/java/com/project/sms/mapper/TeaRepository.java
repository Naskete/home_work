package com.project.sms.mapper;

import com.project.sms.Bean.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface TeaRepository extends JpaRepository<Teacher,Integer> {
    @Query("select s from Teacher s where s.name=?1")
    Teacher findByName(String name);

    @Query("select s from Teacher  s where s.clazz=?1")
    Teacher findByClazz(String clazz);
}
