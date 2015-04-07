package foo.bar.lab08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SomeService {

    @Autowired
    @DaoQualifier(value = DaoType.FIRST)
    private Dao dao1;

    @Autowired
    @DaoQualifier(value = DaoType.SECOND)
    private Dao dao2;

    public void doSomething(){
        dao1.crud();
        dao2.crud();
    }
}
