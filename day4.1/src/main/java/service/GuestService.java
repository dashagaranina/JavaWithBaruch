package service;

import model.Guest;

import java.util.List;

/**
 * Created by Dasha on 10.04.2015.
 */
public interface GuestService {
    void save (Guest guest);
    List<Guest> findAll();
}
