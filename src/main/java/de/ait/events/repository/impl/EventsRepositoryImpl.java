package de.ait.events.repository.impl;

import de.ait.events.model.Event;
import de.ait.events.repository.EventsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class EventsRepositoryImpl implements EventsRepository {
  //language=SQL
  private final JdbcTemplate jdbcTemplate;
  private static final String SQL_SELECT_ALL = "select * from event;";

  @Override
  public List<Event> findAll() {
    return jdbcTemplate.query(SQL_SELECT_ALL, (row, rowNumber) -> Event.builder()
        .id(row.getLong("id"))
        .description(row.getString("description"))
        .title(row.getString("title"))
        .build());
  }
}
