package de.ait.events.dto;

import de.ait.events.model.Event;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(description = "Events list")
public class EventsDto {
  @Schema(description = "List of events")
  private List<EventDto> eventDtoList;

  public static List<EventDto> convertToEventsDto(List<Event> events) {
    return events.stream().map(EventDto::convertToEventDto).collect(Collectors.toList());


  }
}
