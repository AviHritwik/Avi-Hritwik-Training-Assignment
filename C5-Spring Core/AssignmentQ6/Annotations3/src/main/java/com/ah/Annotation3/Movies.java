package com.ah.Annotations3;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:dbConfig.properties")
public class Movies {
	
	
	private BMovies industry;
	private HMovies industry2;
	private TMovies industry3;
	
	@Autowired
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movies(BMovies industry, HMovies industry2, TMovies industry3) {
		super();
		this.industry = industry;
		this.industry2 = industry2;
		this.industry3 = industry3;
	}
	public BMovies getIndustry() {
		return industry;
	}
	@Resource
	public void setIndustry(BMovies industry) {
		this.industry = industry;
	}
	public HMovies getIndustry2() {
		return industry2;
	}
	@Resource
	public void setIndustry2(HMovies industry2) {
		this.industry2 = industry2;
	}
	public TMovies getIndustry3() {
		return industry3;
	}
	@Resource
	public void setIndustry3(TMovies industry3) {
		this.industry3 = industry3;
	}
	@Override
	public String toString() {
		return "Movies [industry=" + industry + ", industry2=" + industry2 + ", industry3=" + industry3 + "]";
	}
	
	
}