package org.eapo.service.sopranoDataService.repository;

import org.eapo.service.sopranoDataService.model.Ptappli;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PtappliRepository extends CrudRepository<Ptappli, String> {

    @Query("select p.idappli from Ptappli p where p.extidappli=:extidappli")
    String getIdappliByExtidappli(String extidappli);
}
