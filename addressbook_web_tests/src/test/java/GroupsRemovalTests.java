import org.junit.jupiter.api.Test;

public class GroupsRemovalTests extends TestBase {

    @Test
    public void groupsRemovalTest() {
        openGroupPage();
        if (!isGroupPresent()) {
            createGroup("GoupName", "GroupHeader", "GroupFooter");
        }
        removeGroup();

    }

}
