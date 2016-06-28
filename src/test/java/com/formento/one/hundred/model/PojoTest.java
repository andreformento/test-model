package com.formento.one.hundred.model;

import com.formento.one.hundred.util.FilterClassesNoTest;
import com.formento.one.hundred.util.ModelTester;
import com.openpojo.reflection.PojoClassFilter;
import com.openpojo.validation.ValidatorBuilder;
import com.openpojo.validation.test.Tester;
import com.openpojo.validation.test.impl.GetterTester;
import com.openpojo.validation.test.impl.SetterTester;
import org.junit.Before;
import org.junit.Test;

public class PojoTest {

    // The package to test
    private static final String POJO_PACKAGE = "com.formento.one.hundred.model";

    private PojoClassFilter pojoClassFilter;

    @Before
    public void init() {
        this.pojoClassFilter = new FilterClassesNoTest();
    }

    @Test
    public void testPojoStructureAndBehaviorGetter() {
        doTester(new GetterTester());
    }

    @Test
    public void testPojoStructureAndBehaviorSetter() {
        doTester(new SetterTester());
    }

    @Test
    public void testPojoStructureAndBehaviorEqualsToStringAndHashCode() {
        doTester(new ModelTester());
    }

    private void doTester(Tester tester) {
        ValidatorBuilder
                .create()
                .with(tester)
                .build()
                .validate(POJO_PACKAGE, this.pojoClassFilter);
    }

}
