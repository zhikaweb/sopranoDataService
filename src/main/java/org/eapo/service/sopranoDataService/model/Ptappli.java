package org.eapo.service.sopranoDataService.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "designApplis")
@EqualsAndHashCode
@Entity
@Table(name = "ptappli",  schema = "patent_test")
public class Ptappli {

	@Id
	private String idappli;

	@OneToMany(mappedBy="ptappli", fetch = FetchType.LAZY, cascade= CascadeType.ALL)
	@JsonManagedReference
	private Set<DesignAppli> designApplis = new HashSet<>();

}
