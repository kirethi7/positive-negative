package com.security.Fortune.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.Fortune.Entity.FortuneTable;

public interface FortuneDao extends JpaRepository<FortuneTable, Integer>{

}
