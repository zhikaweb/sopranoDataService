package org.eapo.service.sopranoDataService.model;

import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString(exclude = "design")
@Entity
@Table(name = "lookin")
public class Lookin {

	@Id
	private Integer iddesign;

	private String whoami;
	private String locclass;
	private String locsubclass;
	private int locclassversion;

	@OneToOne
	@MapsId
	@JoinColumn(name = "iddesign")
	private Design design;
}
