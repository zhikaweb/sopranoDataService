package org.eapo.service.sopranoDataService.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


// select * from design join designappli using (iddesign)
// left join lookin  using (iddesign) left join prioritydesign using (iddesign) where designappli.idappli = :IDAPPLI"

// select * from design join designappli using (iddesign)  left join lookin  using (iddesign)
// left join prioritydesign using (iddesign)  join divisiondesign using (iddesign)
// where divisiondesign.idappli = :IDAPPLI"



// INSERT INTO design (NODESIGN, TITLE, STITLE, IDAPPLIORIG, NBDRAW, PRODUCT)
// VALUES ( :NODESIGN, :TITLE, :STITLE, :IDAPPLIORIG, :NBDRAW, :PRODUCT)";

// INSERT INTO designappli (IDAPPLI, IDDESIGN, ODDESIGN, DGNSTATUS) VALUES (:IDAPPLI, :IDDESIGN, :ODDESIGN, :DGNSTATUS)

// "INSERT INTO lookin (WHOAMI, IDDESIGN, LOCCLASS, LOCSUBCLASS, LOCCLASSVERSION)
// VALUES (:WHOAMI, :IDDESIGN, :MCPO, :SUBMCPO, :LOCCLASSVERSION)";

// INSERT INTO prioritydesign (IDDESIGN, ODPRIO, TYPRIORITY, EXTIDAPPLIPRIO, IDCOUNTRY, DTPRIORITY, RMPRIO) VALUES (:IDDESIGN, :ODPRIO, :TYPRIORITY, :EXTIDAPPLIPRIO, :IDCOUNTRY, :DTPRIORITY, :RMPRIO)

@Data
@Getter
@Setter
@NoArgsConstructor
public class DesignDTO implements Serializable {


}
