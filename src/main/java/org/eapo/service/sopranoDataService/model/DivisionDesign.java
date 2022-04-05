package org.eapo.service.sopranoDataService.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Getter
@Setter
@NoArgsConstructor
public class DivisionDesign {

	private String idappli;
	private String idapplidiv;
	private int divreason;
	private int odhisto;
	private Integer iddesign;

}
