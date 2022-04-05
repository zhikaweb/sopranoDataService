package org.eapo.service.sopranoDataService.service;

import org.eapo.service.sopranoDataService.dto.DesignDTO;
import org.eapo.service.sopranoDataService.repository.DesignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Service("DesignDTOService")
@Transactional
public class DesignDTOServiceImpl implements DesignDTOService {

	@PersistenceContext
	EntityManager entityManager;

	@Autowired
	DesignRepository designRepository;

	@Override
	public List<DesignDTO> getDesignDTO(String idappli) {
		String SELECT_DESIGNS = "select * from design join designappli using (iddesign) " +
				"left join lookin  using (iddesign) left join prioritydesign using (iddesign) where designappli.idappli = :IDAPPLI";
		Query query = entityManager.createNativeQuery(SELECT_DESIGNS);
		query.setParameter("IDAPPLI", idappli);
		return (List<DesignDTO>) query.getResultList();
	}

	@Override
	public List<DesignDTO> getOuterDesignDTO(String idappli) {
		String SELECT_OUTER_DESIGNS = "select * from design join designappli using (iddesign)  left join lookin  using (iddesign) " +
				"left join prioritydesign using (iddesign)  join divisiondesign using (iddesign) " +
				"where divisiondesign.idappli = :IDAPPLI";
		Query query = entityManager.createNativeQuery(SELECT_OUTER_DESIGNS);
		query.setParameter("IDAPPLI", idappli);
		return (List<DesignDTO>) query.getResultList();
	}
}
