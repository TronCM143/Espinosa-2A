import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class mainTest {

    @Test
    void testOutputs() {
        main.Inputs testInputs = new main.Inputs("Froilan Dave", "April 12, 2003", 12, "Surallah, South Cotabato", "Bachelor of Science in Information and Technology");

        String expectedOutput = "Full Name: Froilan Dave\n" +
                "Date of Birth: April 12, 2003\n" +
                "Age: 12\n" +
                "Home Address: Surallah, South Cotabato\n" +
                "Year Level and Course: Bachelor of Science in Information and Technology\n";

        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        testInputs.outputs();

        System.setOut(System.out);

        assertEquals(expectedOutput, outContent.toString());
    }
}
