package controller;

import model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import service.GuestService;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @RequestMapping(method = POST)
    public String create (@ModelAttribute Guest guest){
        guestService.save(guest);
        System.out.println(guest.toString());
        return "redirect:/";
    }

    @RequestMapping(method = GET)
    public String getGuestList(ModelMap map) {
        map.addAttribute("guests", guestService.findAll());
        System.out.println(guestService.findAll().get(0).toString());
        return "guest_page";
    }
}
