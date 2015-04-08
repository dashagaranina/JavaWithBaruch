package foo.bar.lab01;

import java.util.List;

public interface SomeService {
    void registration(String name);
    List<Guest> getGuests();
    Guest findGuestByName(String name);
    void run();
    public void createEvent (Event event);

}
