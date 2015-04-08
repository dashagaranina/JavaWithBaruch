package lab01;

import foo.bar.lab01.AppConfig;
import foo.bar.lab01.SomeService;
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
    private SomeService eventService;

    @Test
    public void registrationAndFindAllTest(){
        eventService.run();
        String name = "Dasha";
        eventService.registration(name);
        Guest guest = eventService.findGuestByName(name);
        Assert.assertEquals(name, guest.getName());
        System.out.println("Guest created successfully");
        Assert.assertEquals(guest.getId(), eventService.getGuests().get(0).getId());
        System.out.println("Tests completed");
    }
}
