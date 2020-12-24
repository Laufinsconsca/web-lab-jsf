package validators;

import beans.CutStringTaskBean;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.constraintvalidation.SupportedValidationTarget;
import jakarta.validation.constraintvalidation.ValidationTarget;

@SupportedValidationTarget(ValidationTarget.PARAMETERS)
public class CutLengthValidator implements
        ConstraintValidator<CutLengthDoNotExceedTheLengthOfTheString, CutStringTaskBean> {
    @Override
    public void initialize (CutLengthDoNotExceedTheLengthOfTheString constraintAnnotation) {
    }

    @Override
    public boolean isValid (CutStringTaskBean value, ConstraintValidatorContext context) {
        int n = 5;
        return false;
    }
}
