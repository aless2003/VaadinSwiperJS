package org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.transition;

import org.vaadin.addons.online.hatsunemiku.diamond.swiper.Swiper;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;

/**
 * An event that is fired everytime when the {@link Swiper} starts an animation.
 */
@DomEvent("flow-swiper-settransition")
public class SetTransitionEvent extends ComponentEvent<Swiper> {

  /**
   * The duration of the current transition (in ms).
   */
  private final long transitionDuration;
  /**
   * Creates a new event using the given source and indicator whether the event originated from the
   * client side or the server side.
   *
   * @param source     the source component
   * @param fromClient <code>true</code> if the event originated from the client
   *                   side, <code>false</code> otherwise
   */
  public SetTransitionEvent(Swiper source, boolean fromClient,
      @EventData("event.detail[1]") long transitionDuration) {
    super(source, fromClient);
    this.transitionDuration = transitionDuration;
  }

  /**
   * Gets the duration of the current transition (in ms).
   *
   * @return long value with the duration of the current transition (in ms).
   */
  public long getTransitionDuration() {
    return transitionDuration;
  }
}
