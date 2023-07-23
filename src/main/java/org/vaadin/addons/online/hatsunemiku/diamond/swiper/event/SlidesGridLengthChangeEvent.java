package org.vaadin.addons.online.hatsunemiku.diamond.swiper.event;

import org.vaadin.addons.online.hatsunemiku.diamond.swiper.Slide;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.Swiper;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * The event is triggered when the {@link Slide}s grid has changed.
 */
@DomEvent("flow-swiper-slidesgridlengthchange")
public class SlidesGridLengthChangeEvent extends ComponentEvent<Swiper> {

  /**
   * Creates a new event using the given source and indicator whether the event originated from the
   * client side or the server side.
   *
   * @param source     the source component
   * @param fromClient <code>true</code> if the event originated from the client
   *                   side, <code>false</code> otherwise
   */
  public SlidesGridLengthChangeEvent(Swiper source, boolean fromClient) {
    super(source, fromClient);
  }
}
