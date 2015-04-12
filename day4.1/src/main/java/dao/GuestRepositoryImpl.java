package dao;

import model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class GuestRepositoryImpl implements GuestRepository {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void save(Guest guest)  {
        String query = "insert into guest (id, g_name, event_id) values (? , ?, ?)";
        jdbcTemplate.update(query, guest.getId(),
                guest.getName(), 1L);
    }

    @Override
    public List<Guest> findAll() {
        String query = "SELECT * FROM GUEST";
        List<Guest> guests = new ArrayList<>();
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(query);
        for (Map row : rows) {
            Guest guest = new Guest();
            guest.setId((Long)row.get("ID"));
            guest.setName((String) row.get("G_NAME"));
            guests.add(guest);
        }
        return guests;
    }


}
