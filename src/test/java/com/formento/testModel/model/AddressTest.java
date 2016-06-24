package com.formento.testModel.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddressTest {

    @Test
    public void shouldCreateAnEntity() {
        // given
        Integer id = 1;
        String street = "Rua XV de Novembro";
        String city = "Blumenau";

        // when
        Address address = new Address();
        address.setId(id);
        address.setStreet(street);
        address.setCity(city);

        // then
        assertEquals(id, address.getId());
        assertEquals(street, address.getStreet());
        assertEquals(city, address.getCity());
    }

}
