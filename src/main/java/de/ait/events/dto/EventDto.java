package de.ait.events.dto;

import de.ait.events.model.Event;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(description = "System events")
public class EventDto {
  @Schema(description = "Identifier event")
  private Long id;
  @Schema(description = "Event description")
  private String description;
  @Schema(description = "Event title")
  private String title;


  public static EventDto convertToEventDto(Event event) {
    return EventDto.builder()
        .id(event.getId())
        .description(event.getDescription())
        .title(event.getTitle())
        .build();
  }
}
