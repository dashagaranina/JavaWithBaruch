package lab01;

import foo.bar.lab01.AppConfig;
import foo.bar.lab01.EventService;
import foo.bar.lab01.Guest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class EventRegistrationTest {

    @Autowired
    private EventService eventService;

    @Test
    public void registrationAndFindAllTest(){
        String name = "Dasha";
        eventService.registration(name);
        Guest guest = eventService.findGuestByName(name);
        Assert.assertEquals(name, guest.getName());
        Assert.assertEquals(guest.getId(), eventService.getGuests().get(0).getId());
    }
}
