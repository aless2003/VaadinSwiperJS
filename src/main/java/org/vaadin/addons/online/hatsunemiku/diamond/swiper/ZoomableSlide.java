package org.vaadin.addons.online.hatsunemiku.diamond.swiper;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;

public class ZoomableSlide extends Slide {


  /**
   * Constructs a ZoomableSlide object.
   *
   * @param component    The component to add to the slide.
   * @param lazy         Set to true to enable lazy loading of images, false otherwise.
   * @param imageElement Set to true if the component is an
   *                     {@link com.vaadin.flow.component.html.Image img}, picture or canvas
   *                     element, false otherwise.
   */
  public ZoomableSlide(Component component, boolean lazy, boolean imageElement) {
    super(lazy);

    if (!imageElement) {
      component.addClassName("swiper-zoom-target");
    }

    Div zoomContainer = new Div();
    zoomContainer.addClassName("swiper-zoom-container");
    zoomContainer.add(component);

    add(zoomContainer);
  }
}
