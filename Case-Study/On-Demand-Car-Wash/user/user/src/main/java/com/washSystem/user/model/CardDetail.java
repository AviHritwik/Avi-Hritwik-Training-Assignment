package com.washSystem.user.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CardDetail {
	@NotBlank(message="Name can not be blank")
	private String cardHolderName;
	@NotBlank(message ="Card Number Must be filled")
	@Size(min=13,max=16,message="Invalid card number")
	private String cardNumber;
	@NotBlank(message="Expiration month must be filled")
	@Size(min=2,max=2, message = "Use MM fromat")
	private String month;
	@NotBlank(message="Expiration year must be filled")
	@Size(min=4,max=4,message="Use YYYY format")
	private String year;
	
	
	
	public CardDetail() {
	}
	public CardDetail(@NotNull String cardHolderName, @NotNull String cardNumber,
			@NotNull @Size(min = 2, max = 2) String month, @NotNull @Size(min = 4, max = 4) String year) {
		this.cardHolderName = cardHolderName;
		this.cardNumber = cardNumber;
		this.month = month;
		this.year = year;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	
	
}
