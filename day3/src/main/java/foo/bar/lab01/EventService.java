package foo.bar.lab01;

import java.util.List;

public interface EventService {
    void registration(String name);
    List<Guest> getGuests();
    Guest findGuestByName(String name);
}
