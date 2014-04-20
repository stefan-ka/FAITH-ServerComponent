package ch.hsr.faith.application.rest.controllers;

import ch.hsr.faith.application.rest.dto.BaseJSONResponse;

public abstract class AbstractController {

	protected BaseJSONResponse createResponse(String status, Object data) {
		BaseJSONResponse response = new BaseJSONResponse(status);
		response.setData(data);
		return response;
	}

}
