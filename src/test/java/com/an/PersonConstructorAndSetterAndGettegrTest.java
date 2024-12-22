/*package com.an;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PersonConstructorAndSetterAndGetterTest {

    @Test
    public void testPersonConstructor() {

        Person jamalPerson = new Person();
        jamalPerson.setFirstName("an");
        jamalPerson.setFamilyName("ma");

        //assertNotNull(jamalPerson);
        assertThat(jamalPerson).isNotNull();

        // assertEquals("Jamal", jamalPerson.getFirstName());
        assertThat(jamalPerson.getFirstName()).isEqualTo("an");

        //assertEquals("Jamali", jamalPerson.getLastName());
        assertThat(jamalPerson.getFamilyName()).isEqualTo("ma");




    }

}
*/