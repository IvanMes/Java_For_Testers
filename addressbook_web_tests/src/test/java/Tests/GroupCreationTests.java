
import model.Group;
import org.junit.jupiter.api.Test;


public class GroupCreationTests extends TestBase {
    @Test
    public void canCreateGroup() {
        app.openGroupPage();
        app.createGroup(new Group("GoupName", "GroupHeader", "GroupFooter"));

    }

    @Test
    public void canCreateGroupWithEmptyName() {

        app.openGroupPage();
        app.createGroup(new Group());

    }
    @Test
    public void canCreateGroupWithNameOnly() {

        app.openGroupPage();
        app.createGroup(new Group().withName("some name"));

    }

}
