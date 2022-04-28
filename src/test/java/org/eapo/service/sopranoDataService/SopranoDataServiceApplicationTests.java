package org.eapo.service.sopranoDataService;

import org.eapo.service.sopranoDataService.service.PtappliServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
class SopranoDataServiceApplicationTests {

	Logger logger = LoggerFactory.getLogger(SopranoDataServiceApplication.class.getName());

	@Autowired
	PtappliServiceImpl ptappliService;

	@Test
	void contextLoads() {
	}

	@Test
	public void getIdappli(){
		ptappliService.getIdappliByExtidappli("202140007");
		ptappliService.getNewIdappliForDesign("202140007");
	}
}

