import foo.bar.lab06.AppConfig;
import foo.bar.lab06.DatabaseException;
import foo.bar.lab06.Repository;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = AppConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RepositoryTest extends TestCase{

    @Autowired
    private Repository repository;

    @Test(expected = DatabaseException.class)
    public void testPersistMessage() throws Exception{
        repository.persistMessage("fytfcu");
    }
}
