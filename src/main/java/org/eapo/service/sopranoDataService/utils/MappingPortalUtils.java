package org.eapo.service.sopranoDataService.utils;

import org.eapo.service.sopranoDataService.dto.DesignDTO;
import org.eapo.soprano.data.service.DesignInfo;

public interface MappingPortalUtils {
    DesignDTO mapToDesignDTO(DesignInfo designInfo, String idappli);
}
