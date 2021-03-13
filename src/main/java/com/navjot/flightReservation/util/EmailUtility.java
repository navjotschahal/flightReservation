package com.navjot.flightReservation.util;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtility {
	
	@Value("${com.navjot.flightReservation.itinerary.email.subject}")
	private String ITIRINERARY_MAIL_SUBJECT ;
	@Value("${com.navjot.flightReservation.itinerary.email.body}")
	private String ITIRENERARY_MAIL_GENERIC_TEXT ;
	
	@Autowired	
	private JavaMailSender sender;
	
	public void sendItinerary(String toAddress, String filePath) {
		
		MimeMessage mimeMessage = sender.createMimeMessage();
		
		try {
			MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
			mimeMessageHelper.setTo(toAddress);
			mimeMessageHelper.setSubject(ITIRINERARY_MAIL_SUBJECT);
			mimeMessageHelper.setText(ITIRENERARY_MAIL_GENERIC_TEXT);
			mimeMessageHelper.addAttachment("Itinearary", new File(filePath));
			sender.send(mimeMessage);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
