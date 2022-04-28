package org.eapo.service.sopranoDataService.service;

import org.eapo.service.sopranoDataService.model.Design;
import org.eapo.service.sopranoDataService.repository.DesignRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DesignServiceImpl implements DesignService {

    private static Logger logger = LoggerFactory.getLogger(DesignServiceImpl.class.getName());

    @Autowired
    DesignRepository designRepository;

    @Override
    public Optional<Design> getDesignById(Integer id) {
        return designRepository.findById(id);
    }
}
