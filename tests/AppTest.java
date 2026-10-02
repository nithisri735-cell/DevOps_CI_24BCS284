import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testMessage() {
        assertEquals("DevOps CI Project bug has been fixed!", App.getMessage());
    }

    @Test
    public void testProjectName() {
        assertEquals("DevOps CI 24BCS284", App.getProjectName());
    }
}