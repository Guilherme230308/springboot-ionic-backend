package com.udemy.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.udemy.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
