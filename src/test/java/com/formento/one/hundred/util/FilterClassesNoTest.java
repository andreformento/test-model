package com.formento.one.hundred.util;

import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.PojoClassFilter;

public class FilterClassesNoTest implements PojoClassFilter {
    public boolean include(PojoClass pojoClass) {
        return !pojoClass.getName().endsWith("Test");
    }
}
