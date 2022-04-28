package org.eapo.service.sopranoDataService.service;

import org.eapo.service.sopranoDataService.model.DesignAppli;
import org.eapo.service.sopranoDataService.repository.DesignAppliRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DesignAppliServiceImpl implements DesignAppliService{

    private static Logger logger = LoggerFactory.getLogger(DesignAppliServiceImpl.class.getName());

    @Autowired
    DesignAppliRepository designAppliRepository;

    @Override
    @Transactional(readOnly = true)
    public List<DesignAppli> getDesignAppliByIdappli(String idappli) {
        logger.info("getting DesignAppli...");
        List<DesignAppli> designAppli =  designAppliRepository.getDesignAppliByIdappli(idappli);
        logger.info(designAppli.toString());
        return designAppli;
    }


}
