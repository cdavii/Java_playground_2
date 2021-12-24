package advanced_junit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SpartanTests {
    private Spartan spartan;


    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");

    }

    @BeforeEach
    void setup(TestInfo testInfo) {
        spartan = new Spartan(1, "Callum", "Java", LocalDate.of(2021,1,1));
        System.out.println(testInfo.getDisplayName() + " is being run");

    }


    @Disabled
    @RepeatedTest(value = 5)
    @DisplayName("This is my test")
    void thisIsMyTest() {
    }

    @Tag("MyTests")
    @Test
    @DisplayName("Each spartan has different ID's")
    void uniqueSpartanIds() {
        Spartan spartanOne = new Spartan(1, "Fred", "Java", LocalDate.of(2021,1,1));
        Spartan spartanTwo = new Spartan(1, "James", "Java", LocalDate.of(2021,1,1));
        Assertions.assertNotEquals(spartanOne.getId(), spartanTwo.getId());
    }

    @Tag("MyTests")
    @Test
    @DisplayName("Spartan is called Callum")
    void spartanIsCalledCallum() {
        Assumptions.assumeTrue(spartan.getName() != null);
        Assertions.assertEquals("Callum", spartan.getName());
    }

    @Tag("MyTests")
    @Test
    @DisplayName("Course is Java")
    void courseIsJava() {
        Assumptions.assumeTrue(spartan.getCourse() != null);
        Assertions.assertEquals("Java", spartan.getCourse());
    }

    @Tag("MyTests")
    @Test
    @DisplayName("Date is not in the future")
    void dateIsNotFuture() {
        Assumptions.assumeTrue((spartan.getStartDate() != null));
        Assertions.assertTrue(LocalDate.now().isAfter(spartan.getStartDate()));
    }

    @Tag("MyTests")
    @Test
    @DisplayName("Course did not start before Sparta existed")
    void dateIsFeasible() {
        Assumptions.assumeTrue((spartan.getStartDate() != null));
        Assertions.assertTrue(spartan.getStartDate().isAfter(LocalDate.of(2014,1,1)));
    }

    @Tag("MyTests")
    @Test
    @DisplayName("ID is positive")
    void positiveId() {
        Spartan negativeId = new Spartan(-1, "Tom", "C#", LocalDate.of(2021,1,1));
        Assertions.assertTrue(negativeId.getId() > 0);
    }

    @Tag("MyTests")
    @Test
    @DisplayName("Name contains numbers")
    void nameContainsNumbers() {
        Assumptions.assumeTrue(spartan.getName() != null);
        Assertions.assertFalse(spartan.getName().matches(".*\\d.*"));
    }

    @Tag("MyTests")
    @Test
    @DisplayName("Name contains punctuation")
    void nameContainsPunctuation() {
        Assumptions.assumeTrue(spartan.getName() != null);
        Assertions.assertFalse(spartan.getName().matches(".*\\p{Punct}.*"));
    }


    @AfterEach
    void tearDown(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName() + " has finished testing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " completed");
    }

}
