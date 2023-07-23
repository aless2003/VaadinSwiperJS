package org.vaadin.addons.online.hatsunemiku.diamond.swiper.event;

import org.vaadin.addons.online.hatsunemiku.diamond.swiper.Swiper;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;

/**
 * An event that is fired when the location of the {@link Swiper} is changed.
 */
@DomEvent("flow-swiper-settranslate")
public class SetTranslateEvent extends ComponentEvent<Swiper> {

  /**
   * By how much the {@link Swiper} was translated.
   */
  private final long translate;

  /**
   * Creates a new event using the given source and indicator whether the event originated from the
   * client side or the server side.
   *
   * @param source     the source component
   * @param fromClient <code>true</code> if the event originated from the client
   *                   side, <code>false</code> otherwise
   */
  public SetTranslateEvent(Swiper source, boolean fromClient, @EventData("event.detail[1]") int translate) {
    super(source, fromClient);
    this.translate = translate;
  }

  /**
   * Gets the value by which the {@link Swiper} was translated.
   *
   * @return long value with the value by which the {@link Swiper} was translated.
   */
  public long getTranslate() {
    return translate;
  }
}
