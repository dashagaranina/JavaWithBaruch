package foo.bar.lab06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl implements SomeService {

    @Autowired
    private Repository repository;


    @Override
    public void saveData() {
        try {
            repository.persistMessage("My msg!");
        } catch (DatabaseException ex){
            throw ex;
        }
    }
}
