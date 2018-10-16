package org.casper.ui;

import java.util.Scanner;

import org.casper.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component
@Setter
public class FortuneUI {

	private Scanner scanner = new Scanner(System.in);
	@Autowired
	private FortuneService service;
	
	public void start() {
		System.out.println("������ �غ� �ϰ� ����..");
		scanner.nextLine();
		String result = service.getResult();
		System.out.println(result);
		
	}
}
