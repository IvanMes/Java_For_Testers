
import model.Group;
import org.junit.jupiter.api.Test;


public class GroupCreationTests extends TestBase {
    @Test
    public void canCreateGroup() {
        openGroupPage();
        createGroup(new Group("GoupName", "GroupHeader", "GroupFooter"));

    }

    @Test
    public void canCreateGroupWithEmptyName() {

        openGroupPage();
        createGroup(new Group());

    }
    @Test
    public void canCreateGroupWithNameOnly() {

        openGroupPage();
        createGroup(new Group().withName("some name"));

    }

}
