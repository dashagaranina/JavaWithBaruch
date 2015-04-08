package foo.bar.lab01;

import java.util.List;

/**
 * Created by Dasha on 08.04.2015.
 */
public interface EventRepository {
    void saveGuest(Guest guest);
    Event getEvent(Long id);
    List<Event> getEvents();
    List<Guest> getGuests();
    Guest findByName(String name);
}
