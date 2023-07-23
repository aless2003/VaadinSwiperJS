package org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.index;

import org.vaadin.addons.online.hatsunemiku.diamond.swiper.Swiper;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * An event that is fired when the real index changes.
 */
@DomEvent("flow-swiper-realindexchange")
public class RealIndexChangeEvent extends ComponentEvent<Swiper> {

  /**
   * Creates a new event using the given source and indicator whether the event originated from the
   * client side or the server side.
   *
   * @param source     the source component
   * @param fromClient <code>true</code> if the event originated from the client
   *                   side, <code>false</code> otherwise
   */
  public RealIndexChangeEvent(Swiper source, boolean fromClient) {
    super(source, fromClient);
  }
}
