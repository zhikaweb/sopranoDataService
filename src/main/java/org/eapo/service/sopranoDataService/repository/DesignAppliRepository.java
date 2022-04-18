package org.eapo.service.sopranoDataService.repository;

import org.eapo.service.sopranoDataService.model.Design;
import org.eapo.service.sopranoDataService.model.DesignAppli;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignAppliRepository extends CrudRepository<DesignAppli, String> {
}
