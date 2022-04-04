package org.eapo.service.sopranoDataService.model;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "designappli")
public class DesignAppli {

	@Id
	private String idappli;

	@Id
	private Integer iddesign;

	private int oddesign;
	private int dgnstatus;
	private int exreason;
	private Date dtexclude;

}
