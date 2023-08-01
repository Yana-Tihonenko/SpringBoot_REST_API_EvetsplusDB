package de.ait.events.controller.impl;

import de.ait.events.controller.api.EventsApi;
import de.ait.events.dto.EventsDto;
import de.ait.events.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EventsApiImpl implements EventsApi {

  private final EventService eventService;

  @Override
  public EventsDto getAllEvents() {
    return eventService.getAllEvents();
  }
}
