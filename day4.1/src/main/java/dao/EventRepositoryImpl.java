package dao;

import model.Event;
import model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Component
public class EventRepositoryImpl implements EventRepository {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Event findOne(Long id) {
        String query = "SELECT * FROM EVENT WHERE ID = ?";
        String queryForGuests = "select * from guest where event_id = ?";
        List<Guest> guests = new ArrayList<>();
//        List<Map<String, Object>> rows = jdbcTemplate.queryForList(queryForGuests);
//        for (Map row : rows) {
//            Guest guest = new Guest();
//            guest.setId((Long) row.get("ID"));
//            guest.setName((String) row.get("G_NAME"));
//            guests.add(guest);
//        }
         return jdbcTemplate.queryForObject(
                query, new Object[]{id}, (rs, rowNum) -> {
                    Event event = new Event();
                    event.setId(rs.getLong("ID"));
                    event.setName(rs.getString("E_NAME"));
                    event.setGuests(new HashSet<>(guests));
                    return event;
                });
    }
}
