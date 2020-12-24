package validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CutLengthValidator.class)
@Documented
public @interface CutLengthDoNotExceedTheLengthOfTheString {

    String message () default "The cut length shouldn't exceed the length" +
            "of the string";

    Class<?>[] groups () default {};
    Class<? extends Payload>[] payload () default {};
}