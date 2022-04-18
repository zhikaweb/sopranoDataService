package org.eapo.service.sopranoDataService.service;

import org.eapo.service.sopranoDataService.model.DesignAppli;
import org.eapo.service.sopranoDataService.repository.DesignAppliRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DesignAppliServiceImpl implements DesignAppliService{

    @Autowired
    DesignAppliRepository designAppliRepository;

    @Override
    public Optional<DesignAppli> getDesignAppliByIdappli(String idappli) {
        return designAppliRepository.findById(idappli);
    }
}
