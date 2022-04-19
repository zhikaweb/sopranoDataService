package org.eapo.service.sopranoDataService.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"ptappli"})
@EqualsAndHashCode
@Entity
@Table(name = "designappli")
@IdClass(DesignAppliId.class)
public class DesignAppli {

	@Id
	private String idappli;

	@Id
	private Integer iddesign;

	private int oddesign;
	private int dgnstatus;
	private Integer exreason;
	private Date dtexclude;

	@ManyToOne(fetch= FetchType.LAZY, cascade= CascadeType.MERGE)
	@JoinColumn(name="idappli", insertable = false, updatable = false)
	@JsonBackReference
	private Ptappli ptappli;

	@ManyToOne(fetch= FetchType.EAGER, cascade= CascadeType.MERGE)
	@JoinColumn(name="iddesign", insertable = false, updatable = false)
	@JsonBackReference
	private Design design;
}
