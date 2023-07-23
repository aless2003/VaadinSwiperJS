package org.vaadin.addons.online.hatsunemiku.diamond.swiper.event;

import org.vaadin.addons.online.hatsunemiku.diamond.swiper.Swiper;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * The event will be fired when the user touches and moves their finger over the Swiper.
 */
@DomEvent("flow-swiper-slidermove")
public class SliderMoveEvent extends ComponentEvent<Swiper> {

  /**
   * Creates a new event using the given source and indicator whether the event originated from the
   * client side or the server side.
   *
   * @param source     the source component
   * @param fromClient <code>true</code> if the event originated from the client
   *                   side, <code>false</code> otherwise
   */
  public SliderMoveEvent(Swiper source, boolean fromClient) {
    super(source, fromClient);
  }
}
