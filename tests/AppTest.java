import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testMessage() {
        assertEquals("Feature and bugfix changes are integrated successfully!", App.getMessage());
    }

    @Test
    public void testProjectName() {
        assertEquals("DevOps CI Project 24BCS284", App.getProjectName());
    }
   @Test
public void testStudentId() {
    assertEquals("24BCS284", App.getStudentId());
}
}