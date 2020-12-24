package validator;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;

public class StringValidator implements Validator {
    @Override public void validate(FacesContext facesContext, UIComponent uiComponent, Object o)
            throws ValidatorException {
        if (o.toString().trim().length() == 0) {
            FacesMessage msg = new FacesMessage("Error validation number",
                    "Строка не должна быть пустой или состоять из пробелов");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
    }
}
