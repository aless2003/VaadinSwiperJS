package org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.loopfix;

import org.vaadin.addons.online.hatsunemiku.diamond.swiper.Swiper;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * As per the <a href="https://swiperjs.com/api/#events">Swiper Documentation</a> this event will fire right before "loop fix"
 * Read the <a href="https://swiperjs.com/api/#events">Swiper.js documentation</a> for more information.
 */
@DomEvent("flow-swiper-beforeloopfix")
public class BeforeLoopFixEvent extends ComponentEvent<Swiper> {

  /**
   * Creates a new event using the given source and indicator whether the event originated from the
   * client side or the server side.
   *
   * @param source     the source component
   * @param fromClient <code>true</code> if the event originated from the client
   *                   side, <code>false</code> otherwise
   */
  public BeforeLoopFixEvent(Swiper source, boolean fromClient) {
    super(source, fromClient);
  }
}