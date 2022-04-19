package org.eapo.service.sopranoDataService.service;

import org.eapo.service.sopranoDataService.model.DesignAppli;
import org.eapo.service.sopranoDataService.repository.DesignAppliRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DesignAppliServiceImpl implements DesignAppliService{

    @Autowired
    DesignAppliRepository designAppliRepository;

    @Override
    @Transactional(readOnly = true)
    public List<DesignAppli> getDesignAppliByIdappli(String idappli) {
        return designAppliRepository.getDesignAppliByIdappli(idappli);
    }


}
