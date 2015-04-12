package service;

import dao.GuestRepository;
import model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestRepository guestRepository;

    @Override
    public void save(Guest guest) {
        guestRepository.save(guest);
    }

    @Override
    public List<Guest> findAll() {
        return guestRepository.findAll();
    }
}
