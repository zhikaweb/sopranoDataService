package org.eapo.service.sopranoDataService.service;

import org.eapo.service.sopranoDataService.ws.client.GengenService;
import org.eapo.service.sopranoDataService.ws.client.GengenServiceImplService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class GengenTest {

    Logger logger = LoggerFactory.getLogger(DesignAppliTest.class.getName());

    @Test
    public void callGengen() {
        GengenServiceImplService gengenServiceImplService = new GengenServiceImplService();
        GengenService gengenService = gengenServiceImplService.getGengenServiceImplPort();
        System.out.println(gengenService.getNextApplicationNumber()); // return "k_id_extidappli"
        System.out.println(gengenService.getExtIdappli());
        System.out.println(gengenService.getNextApplicationNumberForDesign()); // return "k_indappli"
    }
}
