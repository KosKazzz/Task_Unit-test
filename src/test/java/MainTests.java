import org.junit.jupiter.api.*;



public class MainTests {


    @BeforeAll
    public static void announceStartTests() {
        System.out.println("Testing start!");
    }

    @AfterAll
    public static void announceStopTests() {
        System.out.println("Testing completed.");
    }

    @Test
    @DisplayName("The first letter is uppercase!")
    void firstLetterTrue() {
        Assertions.assertTrue(Main.firstLetterUpperCase("QWery"));
    }

    @Test
    @DisplayName("The first letter is not uppercase!")
    void firstLetterFalse() {
        Assertions.assertFalse(Main.firstLetterUpperCase("qwery"));
    }

    @Test
    @DisplayName("Слово -длиннее- длиннее чем слово -короче-")
    void compareStrOne() {
        Assertions.assertEquals("длиннее", Main.compareStrings("длиннее", "короче"));
    }

    @Test
    @DisplayName("Слова равны по длине")
    void compareStrTwo() {
        Assertions.assertEquals("короче1", Main.compareStrings("короче2", "короче1"));
    }

}
