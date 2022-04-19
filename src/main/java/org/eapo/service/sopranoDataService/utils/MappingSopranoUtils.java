package org.eapo.service.sopranoDataService.utils;

import org.eapo.service.sopranoDataService.dto.DesignDTO;
import org.eapo.service.sopranoDataService.model.Design;

public interface MappingSopranoUtils {
    Design mapToDesign(DesignDTO designDTO);
}
