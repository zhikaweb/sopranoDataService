package org.eapo.service.sopranoDataService.service;

import org.eapo.service.sopranoDataService.model.DesignAppli;
import org.eapo.service.sopranoDataService.repository.DesignAppliRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class DesignAppliTest {

    Logger logger = LoggerFactory.getLogger(DesignAppliTest.class.getName());

    @Autowired
    DesignAppliService designAppliService;

    @Test
    public void getDesignAppliByIdAppli() {
        List<DesignAppli> designAppli =  designAppliService.getDesignAppliByIdappli("D202140007");
        logger.info("DesignAppli: {}", designAppli);
    }

}
