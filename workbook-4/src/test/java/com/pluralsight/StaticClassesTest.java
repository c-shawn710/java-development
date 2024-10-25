package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaticClassesTest {

    @Test
    void formatFullName() {
        //arrange
        String lastName = "Chung";
        String prefix = "Mr";
        String firstName = "Shawn";
        String middleName = "S,";
        String suffix = "Dr";

        // act
        String processedName = StaticClasses.formatFullName(lastName, prefix, firstName, middleName, suffix);

        //assert
        String expectedName = "Chung, Mr. Shawn S, Dr";
        assertEquals(expectedName, processedName);
    }
}