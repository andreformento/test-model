package com.formento.testModel.model;

import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.PojoClassFilter;
import com.openpojo.validation.Validator;
import com.openpojo.validation.ValidatorBuilder;
import com.openpojo.validation.rule.impl.GetterMustExistRule;
import com.openpojo.validation.rule.impl.SetterMustExistRule;
import com.openpojo.validation.test.impl.GetterTester;
import com.openpojo.validation.test.impl.SetterTester;
import org.junit.Before;
import org.junit.Test;

public class AddressTest {

    // The package to test
    private static final String POJO_PACKAGE = "com.formento.testModel.model";

    private PojoClassFilter pojoClassFilter;

    @Before
    public void init() {
        this.pojoClassFilter = new FilterTestClasses();
    }

    private static class FilterTestClasses implements PojoClassFilter {
        public boolean include(PojoClass pojoClass) {
            return !pojoClass.getName().endsWith("Test");
        }
    }

    @Test
    public void testPojoStructureAndBehavior() {
        Validator validator = ValidatorBuilder.create()
                // Add Rules to validate structure for POJO_PACKAGE
                // See com.openpojo.validation.rule.impl for more ...
                .with(new GetterMustExistRule())
                .with(new SetterMustExistRule())
                // Add Testers to validate behaviour for POJO_PACKAGE
                // See com.openpojo.validation.test.impl for more ...
                .with(new SetterTester())
                .with(new GetterTester())
                .build();

        validator.validate(POJO_PACKAGE, this.pojoClassFilter);
    }

}
