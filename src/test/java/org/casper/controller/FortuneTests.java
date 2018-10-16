package org.casper.controller;

import org.casper.ui.FortuneUI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")	//스프링을 로딩하는 코드
@Log4j
public class FortuneTests {

	@Autowired	// 자동으로 가져옴
	private FortuneUI ui;	// FortuneUI가 있으면 찔러줘라고 Autowired를 걸음.
	
	@Test
	public void test() {
		ui.start();
	}
}
