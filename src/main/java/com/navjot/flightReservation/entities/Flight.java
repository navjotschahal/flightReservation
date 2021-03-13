package com.navjot.flightReservation.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Flight extends AbstractEntity {
	
	@Column(name = "FLIGHT_NUMBER")
	private String flightNumber;
	@Column(name = "OPERATING_AIRLINES")
	private String operatingArlines;
	@Column(name = "DEPARTURE_CITY")
	private String departureCity;
	@Column(name = "ARRIVAL_CITY")
	private String arrivalCity;
	@Column(name = "DATE_OF_DEPARTURE")
	private Date dateOfDeparture;
	@Column(name = "ESTIMATED_DEPARTURE_TIME")
	private Timestamp estimatedDepartureTime;
	  
	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}
	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	/**
	 * @return the operatingArlines
	 */
	public String getOperatingArlines() {
		return operatingArlines;
	}
	/**
	 * @param operatingArlines the operatingArlines to set
	 */
	public void setOperatingArlines(String operatingArlines) {
		this.operatingArlines = operatingArlines;
	}
	/**
	 * @return the departureCity
	 */
	public String getDepartureCity() {
		return departureCity;
	}
	/**
	 * @param departureCity the departureCity to set
	 */
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	/**
	 * @return the arrivalCity
	 */
	public String getArrivalCity() {
		return arrivalCity;
	}
	/**
	 * @param arrivalCity the arrivalCity to set
	 */
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	/**
	 * @return the dateOfDeparture
	 */
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}
	/**
	 * @param dateOfDeparture the dateOfDeparture to set
	 */
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	/**
	 * @return the estimatedDepartureTime
	 */
	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}
	/**
	 * @param estimatedDepartureTime the estimatedDepartureTime to set
	 */
	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
	
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", operatingArlines=" + operatingArlines
				+ ", departureCity=" + departureCity + ", arrivalCity=" + arrivalCity + ", dateOfDeparture="
				+ dateOfDeparture + ", estimatedDepartureTime=" + estimatedDepartureTime + "]";
	}

}
