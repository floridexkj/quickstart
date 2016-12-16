package com.shijie99.util;

import java.util.Properties;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class SendMailUtil {
	public static void sendSimpleMail(String host, String username,
			String password, String from, String[] to, String subject, 
			String text) throws MailException {
		JavaMailSenderImpl sender = new JavaMailSenderImpl();
		Properties prop = new Properties();
		prop.setProperty("mail.smtp.auth", "true");
		prop.setProperty("mail.smtp.timeout", "30000");
		
		sender.setHost(host);
		sender.setUsername(username);
		sender.setPassword(password);
		sender.setJavaMailProperties(prop);
		
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom(from);
		mailMessage.setTo(to);
		
		mailMessage.setSubject(subject);
		mailMessage.setText(text);
		
		sender.send(mailMessage);
	}
}
