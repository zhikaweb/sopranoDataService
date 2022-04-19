package org.eapo.service.sopranoDataService.service;

import org.eapo.service.sopranoDataService.repository.PtappliRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PtappliServiceImpl implements PtappliService {

    @Autowired
    PtappliRepository ptappliRepository;

    @Transactional(readOnly = true)
    @Override
    public String getIdappliByExtidappli(String extidappli) {
        return ptappliRepository.getIdappliByExtidappli(extidappli);
    }
}
