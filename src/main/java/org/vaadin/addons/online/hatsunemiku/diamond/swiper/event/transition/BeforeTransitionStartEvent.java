package org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.transition;

import org.vaadin.addons.online.hatsunemiku.diamond.swiper.Swiper;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import lombok.Getter;

/**
 * An event that will be fired right before the transition of {@link Swiper} starts.
 * Read the <a href="https://swiperjs.com/api/#events">Swiper.js documentation</a> for more information.
 */
@DomEvent("flow-swiper-beforetransitionstart")
public class BeforeTransitionStartEvent extends ComponentEvent<Swiper> {
  @Getter
  private final int speed;

  /**
   * Creates a new event using the given source and indicator whether the event originated from the
   * client side or the server side.
   *
   * @param source     the source component
   * @param fromClient <code>true</code> if the event originated from the client
   *                   side, <code>false</code> otherwise
   */
  public BeforeTransitionStartEvent(Swiper source, boolean fromClient, @EventData("event.detail[1]") int speed) {
    super(source, fromClient);
    this.speed = speed;
  }
}
