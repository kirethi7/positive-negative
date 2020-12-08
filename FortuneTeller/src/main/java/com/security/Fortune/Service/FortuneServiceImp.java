package com.security.Fortune.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.Fortune.Dao.FortuneDao;
import com.security.Fortune.Entity.FortuneTable;

@Service
public class FortuneServiceImp implements FortuneServiceInterface {
	
	@Autowired
	private FortuneDao fortuneDao;
	
	public FortuneServiceImp(FortuneDao fortuneDao) {
		this.fortuneDao = fortuneDao;
	}

	@Override
	public Optional<FortuneTable> getDailyFortuneById(int id) {
		return fortuneDao.findById(id);
	}

}
