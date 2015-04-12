package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.EventService;

@Controller
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @RequestMapping("/{id}")
    public ModelAndView getEvent(@PathVariable Long id) {
        ModelAndView mv = new ModelAndView("event_page");
        mv.addObject("event", eventService.findOne(id));

        return mv;
    }
}
