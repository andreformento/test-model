package com.formento.testModel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestModelApplication.class)
public class TestModelApplicationTests {

    @Test
    public void contextLoads() {

    }

    @Test
    public void shouldExecuteMain() {
        String[] strings = new String[0];
        TestModelApplication.main(strings);
    }

}
