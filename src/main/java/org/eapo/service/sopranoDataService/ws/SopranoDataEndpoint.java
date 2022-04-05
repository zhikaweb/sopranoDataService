package org.eapo.service.sopranoDataService.ws;


import org.eapo.soprano.data.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class SopranoDataEndpoint {

	private static Logger logger = LoggerFactory.getLogger(SopranoDataEndpoint.class.getName());

	private static final String NAMESPACE_URI = "http://service.data.soprano.eapo.org";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "saveApplicationRequest")
	@ResponsePayload
	public SaveApplicationResponse saveApplication(@RequestPayload SaveApplicationRequest request) throws Exception {
		SaveApplicationResponse response = new SaveApplicationResponse();
		if (request.getApplication().getApplicationInfo().getExtidappli() != null) {
			response.setIsSaved(true);
			response.setMessage("Hello " + request.getApplication().getApplicationInfo().getExtidappli());
		} else {
			response.setIsSaved(false);
			response.setMessage("application is null");
		}


		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "saveAdditionRequest")
	@ResponsePayload
	public SaveAdditionResponse saveAddition(@RequestPayload SaveAdditionRequest request) throws Exception {
		SaveAdditionResponse response = new SaveAdditionResponse();
		if (request.getAddition().getAdditionInfo().getExtidappli() != null) {
			response.setIsSaved(true);
			response.setMessage("Hello addition" + request.getAddition().getAdditionInfo().getExtidappli());
		} else {
			response.setIsSaved(false);
			response.setMessage("addition is null");
		}


		return response;
	}

}
