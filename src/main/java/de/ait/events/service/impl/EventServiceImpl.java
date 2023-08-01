package de.ait.events.service.impl;

import de.ait.events.dto.EventsDto;
import de.ait.events.repository.EventsRepository;
import de.ait.events.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static de.ait.events.dto.EventsDto.convertToEventsDto;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

  private final EventsRepository eventsRepository;
  @Override
  public EventsDto getAllEvents() {
    return EventsDto.builder()
        .eventDtoList(convertToEventsDto(eventsRepository.findAll()))
        .build();
  }
}
