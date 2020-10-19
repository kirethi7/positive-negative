package com.facebookComments.CommentsRetrive.Entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "facebookcomments" )
public class FacebookComments {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="Comments")
	private String Comments;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="facebookcomments_id",referencedColumnName="id")
	private List<SubComments> subcomments;

	public FacebookComments() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}

	public List<SubComments> getSubcomments() {
		return subcomments;
	}

	public void setSubcomments(List<SubComments> subcomments) {
		this.subcomments = subcomments;
	}

	public FacebookComments(String firstName, String comments, List<SubComments> subcomments) {
		this.firstName = firstName;
		Comments = comments;
		this.subcomments = subcomments;
	}

	@Override
	public String toString() {
		return "FacebookComments [id=" + id + ", firstName=" + firstName + ", Comments=" + Comments + ", subcomments="
				+ subcomments + "]";
	}

	
}
