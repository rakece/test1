import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testMessage() {
        String expected = "Hello, GitHub Actions Build Successful!";
        assertEquals(expected, getMessage());
    }

    private String getMessage() {
        return "Hello, GitHub Actions Build Successful!";
    }
}
