package org.eapo.service.sopranoDataService.service;

import org.eapo.service.sopranoDataService.model.Design;

import java.util.Optional;

public interface DesignService {
    Optional<Design> getDesignById(Integer id);
}
