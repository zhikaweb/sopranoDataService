package org.eapo.service.sopranoDataService.service;

import org.eapo.service.sopranoDataService.model.DesignAppli;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface DesignAppliService {
    Optional<DesignAppli> getDesignAppliByIdappli(String idappli);
}
