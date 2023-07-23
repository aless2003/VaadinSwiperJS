package org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.touch;

import org.vaadin.addons.online.hatsunemiku.diamond.swiper.Swiper;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * Event will be fired when the user touches and moves their finger over the {@link Swiper} in the opposite direction to the direction parameter.
 */
@DomEvent("flow-swiper-touchmoveopposite")
public class TouchMoveOppositeEvent extends ComponentEvent<Swiper> {

  /**
   * Creates a new event using the given source and indicator whether the event originated from the
   * client side or the server side.
   *
   * @param source     the source component
   * @param fromClient <code>true</code> if the event originated from the client
   *                   side, <code>false</code> otherwise
   */
  public TouchMoveOppositeEvent(Swiper source, boolean fromClient) {
    super(source, fromClient);
  }
}
