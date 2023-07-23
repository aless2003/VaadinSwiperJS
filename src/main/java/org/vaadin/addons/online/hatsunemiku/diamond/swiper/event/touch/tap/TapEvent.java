package org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.touch.tap;

import org.vaadin.addons.online.hatsunemiku.diamond.swiper.Swiper;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * The event will be fired when the user clicks/taps on the Swiper.
 */
@DomEvent("flow-swiper-tap")
public class TapEvent extends ComponentEvent<Swiper>{

  /**
   * Creates a new event using the given source and indicator whether the event originated from the
   * client side or the server side.
   *
   * @param source     the source component
   * @param fromClient <code>true</code> if the event originated from the client
   *                   side, <code>false</code> otherwise
   */
  public TapEvent(Swiper source, boolean fromClient) {
    super(source, fromClient);
  }
}
