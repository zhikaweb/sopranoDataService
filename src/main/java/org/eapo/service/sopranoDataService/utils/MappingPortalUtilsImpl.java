package org.eapo.service.sopranoDataService.utils;

import org.eapo.service.sopranoDataService.dto.DesignDTO;
import org.eapo.soprano.data.service.DesignInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MappingPortalUtilsImpl implements MappingPortalUtils {

    private static Logger logger = LoggerFactory.getLogger(MappingPortalUtilsImpl.class.getName());

    @Override
    public DesignDTO mapToDesignDTO(DesignInfo designInfo, String idappli) {
        logger.info("mapping DesignInfo to DesignDTO...");
        DesignDTO designDTO = new DesignDTO();
        designDTO.setIdappli(idappli);
        designDTO.setIdappliorig(idappli);
        designDTO.setProduct(designInfo.getProduct());
        designDTO.setDgnstatus(DesignDTO.getStatusActive());
        return null;
    }
}
