package com.formento.testModel.model;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class ClientTest {

    @Test
    public void shouldCreateAnEntity() {
        // given
        Integer id = 1;
        String name = "Andre Formento";
        Date birthdate = new Date();

        // when
        Client client = new Client();
        client.setId(id);
        client.setName(name);
        client.setBirthdate(birthdate);

        // then
        assertEquals(id, client.getId());
        assertEquals(name, client.getName());
        assertEquals(birthdate, client.getBirthdate());
    }

}
