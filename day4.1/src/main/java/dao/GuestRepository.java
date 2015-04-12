package dao;

import model.Guest;

import java.util.List;

public interface GuestRepository {

    void save (Guest guest);

    List<Guest> findAll();
}
