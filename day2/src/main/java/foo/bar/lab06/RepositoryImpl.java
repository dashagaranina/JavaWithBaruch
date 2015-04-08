package foo.bar.lab06;

@org.springframework.stereotype.Repository
public class RepositoryImpl implements Repository {


    @Override
    public void persistMessage(String s){
        throw new DatabaseException("Failed to save "+ s);
    }
}
