package com.navjot.flightReservation.util;

import com.navjot.flightReservation.entities.Reservation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Component
public class PDFGenerator {

	private static final String FLIGHT_ITINERARY_TABLE_HEADING = "Flight Itinerary .:";
	private static final String FLIGHT_DETAILS_SECTION = "Flight Details :";
	private static final String DEPARTURE_CITY_HEADING = "Departure City";
	private static final String ARRIVAL_CITY_HEADING = "Arrival City";
	private static final String DATE_OF_DEPARTURE_HEADING = "Date of departure";
	private static final String FLIGHT_NO_HEADING = "Flight number";
	private static final String DEPARTURE_TIME_HEADING = "Departure Time";
	private static final String FIRST_NAME_HEADING = "First Name";
	private static final String LAST_NAME_HEADING = "Last Name";
	private static final String EMAIL_HEADING = "E-mail";
	private static final String PHONE_HEADING = "Phone";
	private static final String PASSENGER_DETAILS_SECTION = "Passenger details :";

	public void generateItineary(Reservation reservation, String filePath) {
		
		Document document = new Document();
		try {
			
			PdfWriter.getInstance(document, new FileOutputStream(filePath));
			
			document.open();
			document.add(generateTable(reservation));
			document.close();
			
		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		}
		
	}

	private PdfPTable generateTable(Reservation reservation) {
		PdfPTable table = new PdfPTable(2);
		PdfPCell cell;
		
		cell = new PdfPCell(new Phrase(FLIGHT_ITINERARY_TABLE_HEADING));
		cell.setColspan(2);
		table.addCell(cell);
		
		cell = new PdfPCell(new Phrase(FLIGHT_DETAILS_SECTION));
		cell.setColspan(2);
		table.addCell(cell);
		
			table.addCell(DEPARTURE_CITY_HEADING);
			table.addCell(reservation.getFlight().getDepartureCity());
			
			table.addCell(ARRIVAL_CITY_HEADING);
			table.addCell(reservation.getFlight().getArrivalCity());
			
			table.addCell(FLIGHT_NO_HEADING);
			table.addCell(reservation.getFlight().getFlightNumber());
			
			table.addCell(DATE_OF_DEPARTURE_HEADING);
			table.addCell(reservation.getFlight().getDateOfDeparture().toString());
			
			table.addCell(DEPARTURE_TIME_HEADING);
			table.addCell(reservation.getFlight().getEstimatedDepartureTime().toString());
		
		cell = new PdfPCell(new Phrase(PASSENGER_DETAILS_SECTION));
		cell.setColspan(2);
		table.addCell(cell);
			
			table.addCell(FIRST_NAME_HEADING);
			table.addCell(reservation.getPassenger().getFirstName());
			
			table.addCell(LAST_NAME_HEADING);
			table.addCell(reservation.getPassenger().getFirstName());
			
			table.addCell(EMAIL_HEADING);
			table.addCell(reservation.getPassenger().getEmail());
			
			table.addCell(PHONE_HEADING);
			table.addCell(reservation.getPassenger().getPhone());
		
		return table;
	}
	
}
