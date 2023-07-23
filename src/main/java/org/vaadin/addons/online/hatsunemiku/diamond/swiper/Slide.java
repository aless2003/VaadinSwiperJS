package org.vaadin.addons.online.hatsunemiku.diamond.swiper;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;

/**
 * A Slide Component from Swiper JS.
 * This is used to wrap any component that you want to be inside a slide.
 */
@Tag("swiper-slide")
public class Slide extends Component implements HasComponents {

  /**
   * Creates a new Slide with the given component inside.
   *
   * @param component the component to be wrapped inside the slide
   */
  public Slide(Component component, boolean lazy) {
    add(component);
    setLazy(lazy);
  }

  private void setLazy(boolean lazy) {
    getElement().setProperty("lazy", lazy);
  }
}
