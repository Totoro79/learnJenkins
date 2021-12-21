package com.leanring.jenkins;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testPersonClassGetSet() {
        Person p = new Person(29, "Jake", "Lloyd");
        assertEquals(p.getAge(), 29);
    }
}