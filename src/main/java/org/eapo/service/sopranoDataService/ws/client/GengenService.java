
package org.eapo.service.sopranoDataService.ws.client;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GengenService", targetNamespace = "http://gengen.service.soprano.eapo.org/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface GengenService {


    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://gengen.service.soprano.eapo.org/GengenService/getExtIdappliRequest", output = "http://gengen.service.soprano.eapo.org/GengenService/getExtIdappliResponse")
    public int getExtIdappli();

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://gengen.service.soprano.eapo.org/GengenService/getIdPersonRequest", output = "http://gengen.service.soprano.eapo.org/GengenService/getIdPersonResponse")
    public int getIdPerson();

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://gengen.service.soprano.eapo.org/GengenService/getNextApplicationNumberRequest", output = "http://gengen.service.soprano.eapo.org/GengenService/getNextApplicationNumberResponse")
    public int getNextApplicationNumber();

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://gengen.service.soprano.eapo.org/GengenService/getNextApplicationNumberForDesignRequest", output = "http://gengen.service.soprano.eapo.org/GengenService/getNextApplicationNumberForDesignResponse")
    public int getNextApplicationNumberForDesign();

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://gengen.service.soprano.eapo.org/GengenService/getIdInventorRequest", output = "http://gengen.service.soprano.eapo.org/GengenService/getIdInventorResponse")
    public int getIdInventor();

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://gengen.service.soprano.eapo.org/GengenService/getIdOwnerRequest", output = "http://gengen.service.soprano.eapo.org/GengenService/getIdOwnerResponse")
    public int getIdOwner();

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://gengen.service.soprano.eapo.org/GengenService/getGengenRequest", output = "http://gengen.service.soprano.eapo.org/GengenService/getGengenResponse")
    public int getGengen();

}
