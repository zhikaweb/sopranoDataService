package org.eapo.service.sopranoDataService.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
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

	@OneToMany(mappedBy="design", fetch = FetchType.LAZY, cascade= CascadeType.ALL)
	@JsonManagedReference
	private Set<DesignAppli> designApplis = new HashSet<>();

	@OneToOne(mappedBy = "design", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Lookin lookin;

	@OneToOne(mappedBy = "design", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private PriorityDesign priorityDesign;

}
