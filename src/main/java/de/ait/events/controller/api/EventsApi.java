package de.ait.events.controller.api;

import de.ait.events.dto.EventsDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Tags(value = {
    @Tag(name = "Events")
})
@RequestMapping("/api")
public interface EventsApi {
  @Operation(summary = "Get all events", description = "Get all events from DB")
  @GetMapping("/events")
  EventsDto getAllEvents();
}
