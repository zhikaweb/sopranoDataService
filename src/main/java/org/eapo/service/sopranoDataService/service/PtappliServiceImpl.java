package org.eapo.service.sopranoDataService.service;

import org.eapo.service.sopranoDataService.repository.PtappliRepository;
import org.eapo.service.sopranoDataService.utils.GengenConnector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PtappliServiceImpl implements PtappliService {

    private static Logger logger = LoggerFactory.getLogger(PtappliServiceImpl.class.getName());

    @Autowired
    PtappliRepository ptappliRepository;

    @Autowired
    GengenConnector gengenConnector;

    @Override
    public String getNewIdappliForDesign(String extidappli) {
            String idappliForDesign = "D" + gengenConnector.getKPtappliNumber();
            logger.info("idappli for design = {}", idappliForDesign);
            return idappliForDesign;
    }

    @Override
    public String getIdappliByExtidappli(String extidappli) {
        String idappli = ptappliRepository.getIdappliByExtidappli(extidappli);
        if (idappli != null) {
            return idappli;
        } else {
            logger.debug("Ptappli with extidappli {} not found", extidappli);
            return null;
        }
    }

}
