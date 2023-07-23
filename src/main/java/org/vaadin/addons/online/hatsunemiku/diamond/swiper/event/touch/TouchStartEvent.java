package org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.touch;

import org.vaadin.addons.online.hatsunemiku.diamond.swiper.Swiper;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * The event will be fired when the user starts touching the {@link Swiper}.
 */
@DomEvent("flow-swiper-touchstart")
public class TouchStartEvent extends ComponentEvent<Swiper> {

  /**
   * Creates a new event using the given source and indicator whether the event originated from the
   * client side or the server side.
   *
   * @param source     the source component
   * @param fromClient <code>true</code> if the event originated from the client
   *                   side, <code>false</code> otherwise
   */
  public TouchStartEvent(Swiper source, boolean fromClient) {
    super(source, fromClient);
  }
}
