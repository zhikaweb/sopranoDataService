package org.eapo.service.sopranoDataService.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "lookin")
public class Lookin {

	@Id
	private Integer iddesign;

	private String whoami;
	private String locclass;
	private String locsubclass;
	private int locclassversion;
}