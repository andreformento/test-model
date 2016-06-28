package com.formento.one.hundred.util;

import com.openpojo.random.RandomFactory;
import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.PojoField;
import com.openpojo.validation.test.Tester;
import com.openpojo.validation.utils.ValidationHelper;

public final class ModelTester implements Tester {

    private Object setValues(final PojoClass pojoClass) {
        final Object classInstance = ValidationHelper.getBasicInstance(pojoClass);
        for (final PojoField fieldEntry : pojoClass.getPojoFields()) {
            if (fieldEntry.hasSetter()) {
                fieldEntry.invokeSetter(classInstance, RandomFactory.getRandomValue(fieldEntry));
            }
        }

        return classInstance;
    }


    public void run(final PojoClass pojoClass) {
        final Object classInstance = setValues(pojoClass);
        System.out.println(classInstance);
    }

}
