package org.eapo.service.sopranoDataService.utils;

import org.eapo.service.sopranoDataService.ws.client.GengenService;
import org.eapo.service.sopranoDataService.ws.client.GengenServiceImplService;
import org.springframework.stereotype.Service;

@Service
public class GengenConnectorImpl implements GengenConnector {

    private static GengenServiceImplService gengenServiceImplService = new GengenServiceImplService();
    private static GengenService gengenService = gengenServiceImplService.getGengenServiceImplPort();

    @Override
    public int getKPtappliNumber() {
        return gengenService.getNextApplicationNumber();
    }
}
