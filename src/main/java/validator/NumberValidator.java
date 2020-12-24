package validator;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;

import java.util.Map;

public class NumberValidator implements Validator {

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        Map<String, String> parameterMap = facesContext.getExternalContext().getRequestParameterMap();
        String string = parameterMap.get("j_idt8:inputString");
        String number = o.toString();
        if (number == null || (number.trim().length() == 0)) {
            throwException("Введите число");
        }
        if (Integer.parseInt(number) < 0) {
            throwException("Введите положительное число");
        }
        if (string.length() < Integer.parseInt(number)) {
            throwException("Количество удаляемых символов не должно превышать длину строки");
        }
    }

    private void throwException(String message) {
        FacesMessage msg = new FacesMessage("Error validation number", message);
        msg.setSeverity(FacesMessage.SEVERITY_ERROR);
        throw new ValidatorException(msg);
    }
}
