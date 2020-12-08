package com.security.Fortune.Service;

import java.util.Optional;

import com.security.Fortune.Entity.FortuneTable;

public interface FortuneServiceInterface{

	public Optional<FortuneTable> getDailyFortuneById(int id);
}
