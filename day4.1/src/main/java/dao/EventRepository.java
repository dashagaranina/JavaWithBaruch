package dao;

import model.Event;

/**
 * Created by Dasha on 10.04.2015.
 */

public interface EventRepository  {
    Event findOne(Long id);

}
