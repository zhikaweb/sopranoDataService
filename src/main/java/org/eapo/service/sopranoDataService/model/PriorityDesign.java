package org.eapo.service.sopranoDataService.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "prioritydesign")
public class PriorityDesign {

	@Id
	private Integer iddesign;

	private int odprio;
	private int typriority;
	private String extidappliprio;
	private String idcountry;
	private Date dtpriority;
	private String rmprio;

	@OneToOne
	@MapsId
	@JoinColumn(name = "iddesign")
	private Design design;
}
