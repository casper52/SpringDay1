package org.casper.controller;

import org.casper.ui.FortuneUI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")	//�������� �ε��ϴ� �ڵ�
@Log4j
public class FortuneTests {

	@Autowired	// �ڵ����� ������
	private FortuneUI ui;	// FortuneUI�� ������ ������ Autowired�� ����.
	
	@Test
	public void test() {
		ui.start();
	}
}
