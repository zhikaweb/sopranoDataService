package org.eapo.service.sopranoDataService.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Date;


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

/**
 * Класс DTO (взят из Soprano)
 */

@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class DesignDTO implements Serializable {
    // статус ПО
    private static final int STATUS_ACTIVE = 1;
    private static final int STATUS_EXCLUDE = 0;

    // организация которая провела классификацию приоритете
    private static final String WHOAMI = "EAPO";

    // версия МКПО
    private static final int CLASS_VERSION = 12;
    // порядковый комер приоритета
    private static final int ODPRIO = 0;

    // Макс. длинна номера заявки приоритета
    private static final int EXTIDPRIO_MAX_LENGTH = 62;

    // разделитель в номере промобразца между номером заявки и собственно самим номером ПО
    private static final String NODESIGN_SUFFIX = "-";

    // номер ПО состот из extidappli + NODESIGN_SUFFIX + 2х значного номера, если меньше то это первичный ввод заявки - добавляем extidappli
    private static final int NODSESIGN_MIN_SIZE = 11;


    // id ПО
    private Long iddesign;

    // номер ПО (номер исходной заявки + 2х значный порядковый номер)
    private String nodesign;

    // порядковый номер  ПО
    private Integer oddesign;

    // название ПО
    private String title;

    // описание ПО
    private String stitle;

    // заявка к которой относится ПО при подаче
    private String idappliorig;

    // класс МКПО - locclass
    private String mcpo;

    // подкласс МКПО - locsubclass
    private String submcpo;

    // число рисунков
    private Integer nbdraw;

    // дата приоритета
    private Date dtpriority;

    // страна приоритета
    private String idcountry;

    // заявка приоритета
    private String extidappliprio;

    // тип приоритета
    private Integer typriority;

    // статус ПО
    private Integer dgnstatus;

    // причина изъятия ПО
    private Integer exreason;

    // дата изъятия ПО
    private Date dtexclude;
    // поле содержит номер заявки к которому относится ПО
    // (может быть незаполнено при сохранении нового ПО - тогда в idappli запишется idappliorig)
    private String idappli;

    // в какую выделяется ПО
    private String idapplito;

    // из какой заявки ПО выделен в текущую
    private String idapplifrom;

    // куда выделен (внешний)
    private String extidapplito;

    // если с клиента приходит true то значит объект надо апдейтить
    private boolean haschange = true;

    // если с клиента приходит true значит объект надо удалять
    private boolean removeMe = false;

    // объект выделен в другую заявку
    private boolean outer = false;

    // причина выделения
    private Integer divreason;

    // od текущей операции
    private Integer odhisto;

    private String product;

    // исключения валидации
    public static final String ERROR_NO_IDAPPLIORIG = "Не задан id заявки";
    public static final String ERROR_NO_ODDESIGN = "Не задан номер промобразца";
    public static final String ERROR_NO_MCPO = "Не задан МКПО";
    public static final String ERROR_NO_SUBMCPO = "Не задан подкласс МКПО";
    public static final String ERROR_NO_DTRRIORITY = "Не задана дата приоритета";
    public static final String ERROR_SIZE_EXTIDAPPLI = "Размер номера изначальной заявки больше " + EXTIDPRIO_MAX_LENGTH;
    public static final String ERROR_DIVISION = "Заданы не все данные для выделения заявки";

    public Long getIddesign() {
        return iddesign;
    }

    public void setIddesign(Long iddesign) {
        this.iddesign = iddesign;
    }

    public String getNodesign() {
        return nodesign;
    }

    public void setNodesign(String nodesign) {
        this.nodesign = nodesign;
    }

    public Integer getOddesign() {
        return oddesign;
    }

    public void setOddesign(Integer oddesign) {
        this.oddesign = oddesign;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStitle() {
        return stitle;
    }

    public void setStitle(String stitle) {
        this.stitle = stitle;
    }

    public String getIdappliorig() {
        return idappliorig;
    }

    public void setIdappliorig(String idappliorig) {
        this.idappliorig = idappliorig;
    }

    public String getMcpo() {
        return mcpo;
    }

    public void setMcpo(String mcpo) {
        this.mcpo = mcpo;
    }

    public String getSubmcpo() {
        return submcpo;
    }

    public void setSubmcpo(String submcpo) {
        this.submcpo = submcpo;
    }

    public Integer getNbdraw() {
        return nbdraw;
    }

    public void setNbdraw(Integer nbdraw) {
        this.nbdraw = nbdraw;
    }

    public Date getDtpriority() {
        return dtpriority;
    }

    public void setDtpriority(Date dtpriority) {
        this.dtpriority = dtpriority;
    }

    public String getIdcountry() {
        return idcountry;
    }

    public void setIdcountry(String idcountry) {
        this.idcountry = idcountry;
    }

    public String getExtidappliprio() {
        return extidappliprio;
    }

    public void setExtidappliprio(String extidappliprio) {
        this.extidappliprio = extidappliprio;
    }

    public Integer getTypriority() {
        return typriority;
    }

    public void setTypriority(Integer typriority) {
        this.typriority = typriority;
    }

    public Integer getDgnstatus() {
        return dgnstatus;
    }

    public void setDgnstatus(Integer dgnstatus) {
        this.dgnstatus = dgnstatus;
    }

    public Integer getExreason() {
        return exreason;
    }

    public void setExreason(Integer exreason) {
        this.exreason = exreason;
    }

    public Date getDtexclude() {
        return dtexclude;
    }

    public void setDtexclude(Date dtexclude) {
        this.dtexclude = dtexclude;
    }

    public String getIdappli() {
        return idappli;
    }

    public void setIdappli(String idappli) {
        this.idappli = idappli;
    }

    public String getIdapplito() {
        return idapplito;
    }

    public void setIdapplito(String idapplito) {
        this.idapplito = idapplito;
    }

    public String getIdapplifrom() {
        return idapplifrom;
    }

    public void setIdapplifrom(String idapplifrom) {
        this.idapplifrom = idapplifrom;
    }

    public String getExtidapplito() {
        return extidapplito;
    }

    public void setExtidapplito(String extidapplito) {
        this.extidapplito = extidapplito;
    }

    public boolean isHaschange() {
        return haschange;
    }

    public void setHaschange(boolean haschange) {
        this.haschange = haschange;
    }

    public boolean isRemoveMe() {
        return removeMe;
    }

    public void setRemoveMe(boolean removeMe) {
        this.removeMe = removeMe;
    }

    public boolean isOuter() {
        return outer;
    }

    public void setOuter(boolean outer) {
        this.outer = outer;
    }

    public Integer getDivreason() {
        return divreason;
    }

    public void setDivreason(Integer divreason) {
        this.divreason = divreason;
    }

    public Integer getOdhisto() {
        return odhisto;
    }

    public void setOdhisto(Integer odhisto) {
        this.odhisto = odhisto;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
