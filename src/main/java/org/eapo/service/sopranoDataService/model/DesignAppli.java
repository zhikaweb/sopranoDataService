package org.eapo.service.sopranoDataService.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
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

	@ManyToOne(fetch= FetchType.LAZY, cascade= CascadeType.MERGE)
	@JoinColumn(name="idappli")
	@JsonBackReference
	private Ptappli ptappli;

	@ManyToOne(fetch= FetchType.LAZY, cascade= CascadeType.MERGE)
	@JoinColumn(name="iddesign")
	@JsonBackReference
	private Design design;
}
