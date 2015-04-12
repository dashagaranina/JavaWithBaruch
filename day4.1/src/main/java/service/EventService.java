package service;

import model.Event;

/**
 * Created by Dasha on 10.04.2015.
 */
public interface EventService {
    Event findOne(Long id);
}
