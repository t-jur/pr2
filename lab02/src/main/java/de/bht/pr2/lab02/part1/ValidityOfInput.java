package de.bht.pr2.lab02.part1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestInputValidity {

    @Test
    void testCorrectConstruction() {
        Student student = new Student("Anna Alt,70001,Medieninformatik,312");
        assertAll("Test correct assignment of variables",
                () -> assertEquals("Anna Alt", student.getName()),
                () -> assertEquals(70001, student.getMatrikelnummer()),
                () -> assertEquals("Medieninformatik", student.getStudiengang()));
    }

    @Test
    void testParseException(){
        assertThrows(StudentParseException.class, () -> new Student(",,,,,"));
    }

    @Test
    void testIDException(){
        assertThrows(RegistrationNumberException.class, () -> new Student("MM,MM,Medieninformatik,312"));
    }

    @Test
    void testTuitionFeeException(){
        assertThrows(NotPaidTuitionFeeException.class,() -> new Student("MM,70001,Medieninformatik,311"));
    }

    @Test
    void testWrongCourseException(){
        assertThrows(WrongCourseOfStudiesException.class,() -> new Student("MM,70001,Mediendinformatik,312"));
    }
}
