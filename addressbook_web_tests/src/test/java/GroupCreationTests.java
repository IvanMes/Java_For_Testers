
import org.junit.jupiter.api.Test;


public class GroupCreationTests extends TestBase {
    @Test
    public void canCreateGroup() {
        openGroupPage();
        createGroup("GoupName", "GroupHeader", "GroupFooter");

    }

    @Test
    public void canCreateGroupWithEmptyName() {

        openGroupPage();
        createGroup("", "", "");

    }

}
