package org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.slide;

import org.vaadin.addons.online.hatsunemiku.diamond.swiper.Slide;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.Swiper;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * An event that will be fired at the beginning of the animation of resetting the {@link Slide} to the current one.
 */
@DomEvent("flow-swiper-slideresettransitionstart")
public class SlideResetTransitionStartEvent extends ComponentEvent<Swiper> {

  /**
   * Creates a new event using the given source and indicator whether the event originated from the
   * client side or the server side.
   *
   * @param source     the source component
   * @param fromClient <code>true</code> if the event originated from the client
   *                   side, <code>false</code> otherwise
   */
  public SlideResetTransitionStartEvent(Swiper source, boolean fromClient) {
    super(source, fromClient);
  }
}
