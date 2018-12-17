package com.outlook.boole.s.zapicwebsite.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reviewer {
    
	
	@Id
	@GeneratedValue()
	private Integer reviewerId;
	private String name;
	private String businessName;
	private String review;
	
	public Reviewer() {
		super();
	}

	public Reviewer(Integer reviewerId, String name, String businessName, String review) {
		super();
		this.reviewerId = reviewerId;
		this.name = name;
		this.businessName = businessName;
		this.review = review;
	}

	public Integer getReviewerId() {
		return reviewerId;
	}

	public void setReviewerId(Integer reviewerId) {
		this.reviewerId = reviewerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}
	
}
