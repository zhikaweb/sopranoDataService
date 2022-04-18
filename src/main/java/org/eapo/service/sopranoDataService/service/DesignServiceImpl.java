package org.eapo.service.sopranoDataService.service;

import org.eapo.service.sopranoDataService.model.Design;
import org.eapo.service.sopranoDataService.repository.DesignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DesignServiceImpl implements DesignService {

    @Autowired
    DesignRepository designRepository;

    @Override
    public Optional<Design> getDesignById(Integer id) {
        return designRepository.findById(id);
    }
}
