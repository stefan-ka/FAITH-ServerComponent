package ch.hsr.faith.application.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.View;

public abstract class AbstractController {

	@Autowired
	protected View jsonView;
	protected static final String DATA_FIELD = "data";
	
}
