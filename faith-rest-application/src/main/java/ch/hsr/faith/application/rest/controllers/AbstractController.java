package ch.hsr.faith.application.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.View;

import ch.hsr.faith.application.rest.dto.BaseJSONResponse;

public abstract class AbstractController {

	@Autowired
	protected View jsonView;

	protected BaseJSONResponse createResponse(String status, Object data) {
		BaseJSONResponse response = new BaseJSONResponse(status);
		response.setData(data);
		return response;
	}

}
