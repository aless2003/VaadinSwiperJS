package org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.zoom;


import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import com.vaadin.flow.dom.Element;
import lombok.Getter;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.Swiper;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.ZoomableSlide;

@DomEvent("flow-swiper-zoomchange")
@Getter
public class ZoomChangeEvent extends ComponentEvent<Swiper> {

  /**
   * The new scale value
   */
  private final double scale;
  /**
   * The Image Element of the {@link ZoomableSlide}
   */
  private final Element imageEl;
  /**
   * The {@link ZoomableSlide} element being zoomed.
   */
  private final ZoomableSlide slideEl;

  /**
   * Creates a new event using the given source and indicator whether the event originated from the
   * client side or the server side.
   *
   * @param source     the source component
   * @param fromClient <code>true</code> if the event originated from the client
   *                   side, <code>false</code> otherwise
   */
  public ZoomChangeEvent(Swiper source,
      boolean fromClient,
      @EventData("event.detail[1]") double scale,
      @EventData("event.detail[2]") Element imageEl,
      @EventData("event.detail[3]") ZoomableSlide slideEl) {
    super(source, fromClient);
    this.scale = scale;
    this.imageEl = imageEl;
    this.slideEl = slideEl;
  }
}
