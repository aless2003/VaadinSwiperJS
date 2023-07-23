package org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.transition;

import org.vaadin.addons.online.hatsunemiku.diamond.swiper.Swiper;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * This event will be fired when the {@link Swiper} has finished its transition.
 */
@DomEvent("flow-swiper-transitionend")
public class TransitionEndEvent extends ComponentEvent<Swiper> {

  /**
   * Creates a new event using the given source and indicator whether the event originated from the
   * client side or the server side.
   *
   * @param source     the source component
   * @param fromClient <code>true</code> if the event originated from the client
   *                   side, <code>false</code> otherwise
   */
  public TransitionEndEvent(Swiper source, boolean fromClient) {
    super(source, fromClient);
  }
}
