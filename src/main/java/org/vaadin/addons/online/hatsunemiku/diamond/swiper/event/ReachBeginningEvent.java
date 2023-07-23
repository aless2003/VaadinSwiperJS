package org.vaadin.addons.online.hatsunemiku.diamond.swiper.event;

import org.vaadin.addons.online.hatsunemiku.diamond.swiper.Swiper;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * An event that is fired when the {@link Swiper} reaches the beginning (the initial {@link org.vaadin.addons.online.hatsunemiku.diamond.swiper.Slide})
 */
@DomEvent("flow-swiper-reachbeginning")
public class ReachBeginningEvent extends ComponentEvent<Swiper> {

  /**
   * Creates a new event using the given source and indicator whether the event originated from the
   * client side or the server side.
   *
   * @param source     the source component
   * @param fromClient <code>true</code> if the event originated from the client
   *                   side, <code>false</code> otherwise
   */
  public ReachBeginningEvent(Swiper source, boolean fromClient) {
    super(source, fromClient);
  }
}
