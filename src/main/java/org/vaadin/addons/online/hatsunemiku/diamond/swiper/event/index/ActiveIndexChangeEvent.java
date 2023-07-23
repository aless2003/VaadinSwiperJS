package org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.index;

import org.vaadin.addons.online.hatsunemiku.diamond.swiper.Slide;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.Swiper;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import lombok.Getter;

/**
 * An event that will be fired when the active index of a {@link Swiper} changes to another {@link Slide}.
 * Read the <a href="https://swiperjs.com/api/#events">Swiper.js documentation</a> for more information.
 */
@DomEvent("flow-swiper-activeindexchange")
public class ActiveIndexChangeEvent extends ComponentEvent<Swiper> {
  @Getter
  private int activeIndex;

  /**
   * Creates a new event using the given source and indicator whether the event originated from the
   * client side or the server side.
   *
   * @param source     the source component
   * @param fromClient <code>true</code> if the event originated from the client
   *                   side, <code>false</code> otherwise
   */
  public ActiveIndexChangeEvent(Swiper source, boolean fromClient,
      @EventData("event.detail[0].activeIndex") int activeIndex) {
    super(source, fromClient);
    this.activeIndex = activeIndex;
  }
}
