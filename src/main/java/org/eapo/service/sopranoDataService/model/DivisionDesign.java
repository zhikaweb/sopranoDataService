package org.eapo.service.sopranoDataService.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity
@Table(name = "divisiondesign")
public class DivisionDesign {

	private String idappli;
	private String idapplidiv;
	private int divreason;
	private int odhisto;
	private Integer iddesign;

}
