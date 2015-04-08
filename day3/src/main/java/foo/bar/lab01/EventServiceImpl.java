package foo.bar.lab01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public void registration(String name) {
        Guest guest = new Guest();
        guest.setId(UUID.randomUUID());
        guest.setName(name);
        eventRepository.saveGuest(guest);
    }

    @Override
    public List<Guest> getGuests() {
        return eventRepository.getGuests();
    }

    @Override
    public Guest findGuestByName(String name) {
        return eventRepository.findByName(name);
    }

    public void run(){
        eventRepository.run();
    }
}
