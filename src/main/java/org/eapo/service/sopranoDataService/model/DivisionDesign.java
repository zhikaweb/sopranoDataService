package org.eapo.service.sopranoDataService.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name = "divisiondesign")
public class DivisionDesign {

	@Id
	private String idappli;
	private String idapplidiv;
	private int divreason;
	private int odhisto;
	private Integer iddesign;

}
