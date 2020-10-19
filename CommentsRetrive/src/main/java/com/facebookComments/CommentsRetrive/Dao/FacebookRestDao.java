package com.facebookComments.CommentsRetrive.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facebookComments.CommentsRetrive.Entity.FacebookComments;

public interface FacebookRestDao extends JpaRepository<FacebookComments, Integer>{

}
