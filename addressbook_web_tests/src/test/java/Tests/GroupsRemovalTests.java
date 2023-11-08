import model.Group;
import org.junit.jupiter.api.Test;

public class GroupsRemovalTests extends TestBase {

    @Test
    public void groupsRemovalTest() {
        app.openGroupPage();
        if (!app.isGroupPresent()) {
            app.createGroup(new Group("GoupName", "GroupHeader", "GroupFooter"));
        }
        app.removeGroup();

    }

}
