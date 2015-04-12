package service;

import dao.EventRepository;
import model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public Event findOne(Long id){

        return eventRepository.findOne(id);
    }
}
