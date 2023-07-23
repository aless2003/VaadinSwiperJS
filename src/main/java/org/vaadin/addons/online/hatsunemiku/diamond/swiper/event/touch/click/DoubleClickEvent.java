package org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.touch.click;

import org.vaadin.addons.online.hatsunemiku.diamond.swiper.Swiper;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * An event that will be fired when the User double clicks/taps on the Swiper.
 * Read the <a href="https://swiperjs.com/api/#events">Swiper.js documentation</a> for more information.
 */
@DomEvent("flow-swiper-doubleclick")
public class DoubleClickEvent extends ComponentEvent<Swiper> {

  /**
   * Creates a new event using the given source and indicator whether the event originated from the
   * client side or the server side.
   *
   * @param source     the source component
   * @param fromClient <code>true</code> if the event originated from the client
   *                   side, <code>false</code> otherwise
   */
  public DoubleClickEvent(Swiper source, boolean fromClient) {
    super(source, fromClient);
  }
}
