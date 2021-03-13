package com.navjot.flightReservation.dto;

public class ReservationRequest { 
	
	private Long flightId;
	private String passengerLastName;
	private String passengerEmail;
	private String passengerPhone;
	private String nameOnTheCard;
	private String expirationDate;
	private String cardNumber;
	private String securityCode;
	private String passengerFname;

	/**
	 * @return the flightId
	 */
	public Long getFlightId() {
		return flightId;
	}

	/**
	 * @param flightId the flightId to set
	 */
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	public String getPassengerFname() {
		return passengerFname;
	}

	public void setPassengerFname(String passengerFname) {
		this.passengerFname = passengerFname;
	}

	/**
	 * @return the passengerLastName
	 */
	public String getPassengerLastName() {
		return passengerLastName;
	}

	/**
	 * @param passengerLastName the passengerLastName to set
	 */
	public void setPassengerLastName(String passengerLastName) {
		this.passengerLastName = passengerLastName;
	}

	/**
	 * @return the passengerEmail
	 */
	public String getPassengerEmail() {
		return passengerEmail;
	}

	/**
	 * @param passengerEmail the passengerEmail to set
	 */
	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}

	/**
	 * @return the passengerPhone
	 */
	public String getPassengerPhone() {
		return passengerPhone;
	}

	/**
	 * @param passengerPhone the passengerPhone to set
	 */
	public void setPassengerPhone(String passengerPhone) {
		this.passengerPhone = passengerPhone;
	}

	/**
	 * @return the nameOnTheCard
	 */
	public String getNameOnTheCard() {
		return nameOnTheCard;
	}

	/**
	 * @param nameOnTheCard the nameOnTheCard to set
	 */
	public void setNameOnTheCard(String nameOnTheCard) {
		this.nameOnTheCard = nameOnTheCard;
	}

	/**
	 * @return the expirationDate
	 */
	public String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the securityCode
	 */
	public String getSecurityCode() {
		return securityCode;
	}

	/**
	 * @param securityCode the securityCode to set
	 */
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	@Override
	public String toString() {
		return "ReservationRequest [flightId=" + flightId
				+ ", passengerLastName=" + passengerLastName + ", passengerEmail=" + passengerEmail
				+ ", passengerPhone=" + passengerPhone + ", nameOnTheCard=" + nameOnTheCard + ", expirationDate="
				+ expirationDate + ", cardNumber=" + cardNumber + ", securityCode=" + securityCode + "]";
	}
	

}
