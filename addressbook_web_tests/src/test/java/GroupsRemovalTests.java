import model.Group;
import org.junit.jupiter.api.Test;

public class GroupsRemovalTests extends TestBase {

    @Test
    public void groupsRemovalTest() {
        openGroupPage();
        if (!isGroupPresent()) {
            createGroup(new Group("GoupName", "GroupHeader", "GroupFooter"));
        }
        removeGroup();

    }

}
