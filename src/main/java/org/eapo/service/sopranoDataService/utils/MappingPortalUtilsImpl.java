package org.eapo.service.sopranoDataService.utils;

import org.eapo.service.sopranoDataService.dto.DesignDTO;
import org.eapo.soprano.data.service.DesignInfo;
import org.springframework.stereotype.Service;

@Service
public class MappingPortalUtilsImpl implements MappingPortalUtils {
    @Override
    public DesignDTO mapToDesignDTO(DesignInfo designInfo, String idappli) {
        DesignDTO designDTO = new DesignDTO();
        designDTO.setIdappli(idappli);
        return null;
    }
}
