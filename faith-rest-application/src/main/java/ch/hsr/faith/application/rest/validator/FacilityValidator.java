package ch.hsr.faith.application.rest.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.service.FacilityService;

@Component
public class FacilityValidator implements Validator {

	@Autowired
	private FacilityService facilityService;

	@Override
	public boolean supports(Class<?> clazz) {
		return Facility.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		if (object instanceof Facility) {
			Facility facility = (Facility) object;
			if (facility.getFacilityCategory() == null) {
				errors.rejectValue("facilityCategory", "emptyField.facility.facilitycategory");
			}
			if (facility.getName() == null || "".equals(facility.getName())) {
				errors.rejectValue("name", "emptyField.facility.name");
			}
			if (facility.getStreet() == null || "".equals(facility.getStreet())) {
				errors.rejectValue("street", "emptyField.facility.street");
			}
			if (facility.getZip() == null || "".equals(facility.getZip())) {
				errors.rejectValue("zip", "emptyField.facility.zip");
			}
			if (facility.getCity() == null || "".equals(facility.getCity())) {
				errors.rejectValue("city", "emptyField.facility.city");
			}
			if (facility.getPhone() == null || "".equals(facility.getPhone())) {
				errors.rejectValue("phone", "emptyField.facility.phone");
			}
			if (facilityService.doesFacilityAlreadyExist(facility.getName(), facility.getZip(), facility.getStreet())) {
				errors.rejectValue("name", "notunique.facility.name");
			}
		}
	}

}
