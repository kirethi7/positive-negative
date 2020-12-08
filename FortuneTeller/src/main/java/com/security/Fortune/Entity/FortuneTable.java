package com.security.Fortune.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fortune")
public class FortuneTable {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "fortune_message")
	private String fortuneMessage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFortune() {
		return fortuneMessage;
	}

	public void setFortune(String fortune) {
		fortuneMessage = fortune;
	}

	public FortuneTable(String fortune) {
		fortuneMessage = fortune;
	}

	public FortuneTable() {
	}

	@Override
	public String toString() {
		return "FortuneEntity [id=" + id + ", Fortune=" + fortuneMessage + "]";
	}

}
