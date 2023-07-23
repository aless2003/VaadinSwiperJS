package org.vaadin.addons.online.hatsunemiku.diamond.swiper.event;

import org.vaadin.addons.online.hatsunemiku.diamond.swiper.Swiper;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import lombok.Getter;

/**
 * An event that is being fired when the progress of the {@link Swiper} is being changed. The progress is a value between 0 and 1.
 */

@DomEvent("flow-swiper-progress")
public class ProgressEvent extends ComponentEvent<Swiper> {

  @Getter
  private final double progress;

  /**
   * Creates a new event using the given source and indicator whether the event originated from the
   * client side or the server side.
   *
   * @param source     the source component
   * @param fromClient <code>true</code> if the event originated from the client
   *                   side, <code>false</code> otherwise
   */
  public ProgressEvent(Swiper source, boolean fromClient, @EventData("event.detail[1]") double progress) {
    super(source, fromClient);
    this.progress = progress;
  }
}
