package org.eapo.service.sopranoDataService.service;

import org.eapo.service.sopranoDataService.dto.DesignDTO;

import java.util.List;

public interface DesignDTOService {
	List<DesignDTO> getDesignDTO(String idappli);
	List<DesignDTO> getOuterDesignDTO(String idappli);
}
