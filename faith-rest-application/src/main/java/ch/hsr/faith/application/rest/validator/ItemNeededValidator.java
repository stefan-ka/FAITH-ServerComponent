package ch.hsr.faith.application.rest.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.hsr.faith.domain.ItemNeeded;

@Component
public class ItemNeededValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return ItemNeeded.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		if (object instanceof ItemNeeded) {
			ItemNeeded itemNeeded = (ItemNeeded) object;
			if (itemNeeded.getAmount() < 0) {
				errors.rejectValue("amount", "emptyField.itemNeeded.amount");
			}
			if (itemNeeded.getFacility() == null) {
				errors.rejectValue("facility", "emptyField.itemNeeded.facility");
			}
			if (itemNeeded.getPieceOfFurniture() == null) {
				errors.rejectValue("pieceOfFurniture", "emptyField.itemNeeded.pieceOfFurniture");
			}
		}
	}

}
