package org.eapo.service.sopranoDataService.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "design")
public class Design {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iddesign;
	private String nodesign;
	private String title;
	private String stitle;
	private String idappliorig;
	private int nbdraw;
	private String product;

}
