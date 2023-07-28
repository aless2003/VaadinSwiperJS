package org.vaadin.addons.online.hatsunemiku.diamond.swiper;

import java.util.Objects;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.constants.Direction;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.constants.LanguageDirection;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.BreakpointEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.FromEdgeEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.MomentumBounceEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.ObserverUpdateEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.ProgressEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.ReachBeginningEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.ReachEndEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.SetTranslateEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.SliderFirstMoveEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.SliderMoveEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.SlidesGridLengthChangeEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.SlidesLengthChangeEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.SnapGridLengthChangeEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.SnapIndexChangeEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.ToEdgeEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.UpdateEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.direction.ChangeDirectionEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.direction.OrientationChangeEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.index.ActiveIndexChangeEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.index.RealIndexChangeEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.lifecycle.destroy.BeforeDestroyEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.lifecycle.destroy.DestroyEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.lifecycle.init.AfterInitEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.lifecycle.init.BeforeInitEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.lifecycle.init.InitEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.lock.LockEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.lock.UnlockEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.loopfix.BeforeLoopFixEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.loopfix.LoopFixEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.resize.BeforeResizeEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.resize.ResizeEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.slide.BeforeSlideChangeStartEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.slide.SlideChangeEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.slide.SlideChangeTransitionEndEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.slide.SlideChangeTransitionStartEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.slide.SlideNextTransitionEndEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.slide.SlideNextTransitionStartEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.slide.SlidePrevTransitionEndEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.slide.SlidePrevTransitionStartEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.slide.SlideResetTransitionEndEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.slide.SlideResetTransitionStartEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.touch.TouchEndEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.touch.TouchMoveEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.touch.TouchMoveOppositeEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.touch.TouchStartEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.touch.click.ClickEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.touch.click.DoubleClickEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.touch.tap.DoubleTapEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.touch.tap.TapEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.transition.BeforeTransitionStartEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.transition.SetTransitionEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.transition.TransitionEndEvent;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.transition.TransitionStartEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.shared.Registration;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Wrapper component the SwiperJS Web Component. CSS parts available for styling can be found <a
 * href="https://swiperjs.com/element#parts">here</a>
 */
@Tag("swiper-container")
@NpmPackage(value = "swiper", version = "^10.0.3")
@CssImport(value = "./swiper.css")
@JsModule("./SwiperHelper.js")
public class Swiper extends Component implements HasComponents {

  private static final Logger logger = LoggerFactory.getLogger(Swiper.class);
  private final boolean lazyLoading;
  private int activeIndex;
  /**
   * The {@link LanguageDirection language direction} of the Swiper. This is NOT updated if the DOM
   * is manipulated directly.
   */
  private LanguageDirection languageDirection;

  public Swiper() {
    getElement().setAttribute("events-prefix", "flow-swiper-");
    SwiperConfig defaultConfig = SwiperConfig.builder().build();
    this.lazyLoading = defaultConfig.isLazy();
    setConfigParams(defaultConfig);
    addListeners();
  }


  /**
   * Constructor with components to add to the Swiper.
   *
   * @param components The components to add to the Swiper.
   */
  public Swiper(Component... components) {
    this();
    add(components);
  }

  /**
   * Constructor with components to add to the Swiper and a {@link SwiperConfig config} to configure
   * the Swiper.
   *
   * @param config     The {@link SwiperConfig config} to configure the Swiper.
   * @param components The components to add to the Swiper.
   */
  public Swiper(SwiperConfig config, Component... components) {
    this(components);
    setConfigParams(config);
  }

  /**
   * Constructor with a {@link SwiperConfig config} to configure the Swiper.
   *
   * @param config The {@link SwiperConfig config} to configure the Swiper.
   */
  public Swiper(SwiperConfig config) {
    this();
    setConfigParams(config);
  }

  /**
   * Adds the given components to this component.
   *
   * @param components the components to add to the Swiper.
   */
  @Override
  public void add(Component... components) {
    List<Component> slides = getSlidesFromComponents(components);

    add(slides);
  }

  /**
   * Adds the given components to the Swiper at the beginning. This means that Component index 0 in
   * the array will be the first slide, the second component in the array will be the second slide,
   * and so on.
   *
   * @param components the components to add to the Swiper.
   */
  public void addAtBeginning(Component... components) {
    List<Component> slides = getSlidesFromComponents(components);

    for (int i = 0; i < slides.size(); i++) {
      getElement().insertChild(i, slides.get(i).getElement());
    }
  }

  /**
   * Wraps all the given components in {@link Slide slides} and returns a {@link List} of them.
   *
   * @param components The components to wrap in slides.
   * @return A {@link List} of {@link Slide slides} containing the given components.
   * @throws IllegalArgumentException if any of the components is null.
   */
  private List<Component> getSlidesFromComponents(Component[] components) {

    if (Arrays.stream(components).anyMatch(Objects::isNull)) {
      throw new IllegalArgumentException("Components cannot be null");
    }

    return Arrays.stream(components)
        .map(c -> new Slide(c, lazyLoading))
        .collect(Collectors.toList());
  }

  /**
   * Adds the given component to the Swiper at the beginning. Meaning it will be the first slide.
   *
   * @param component The component to add to the Swiper.
   */
  public void addAtBeginning(Component component) {
    addAtBeginning(new Component[]{component});
  }

  /**
   * Adds the given components to the Swiper at the index specified. This means that the first
   * component in the array will be the slide at the given index, the second component in the array
   * will be the slide at the index + 1, and so on.
   *
   * @param index      The index to add the components at.
   * @param components The components to add to the Swiper.
   * @throws IndexOutOfBoundsException if the index is smaller than 0 or bigger than the number of
   *                                   current slides.
   */
  public void add(int index, Component... components) {

    int childCount = getElement().getChildCount();

    if (index < 0 || index > childCount) {
      throw new IndexOutOfBoundsException("Index must be between 0 and " + childCount);
    }

    List<Component> slides = getSlidesFromComponents(components);

    for (int i = 0; i < slides.size(); i++) {
      getElement().insertChild(index + i, slides.get(i).getElement());
    }
  }

  /**
   * Adds the given component to the Swiper at the index specified. Meaning it will be the slide at
   * the given index.
   *
   * @param index     The index to add the component at.
   * @param component The component to add to the Swiper.
   * @throws IndexOutOfBoundsException if the index is smaller than 0 or bigger than the number of
   *                                   current slides.
   */
  public void add(int index, Component component) {
    add(index, new Component[]{component});
  }

  private void addListeners() {
    addActiveIndexChangeEventListener(e -> {
      this.activeIndex = e.getActiveIndex();
    });
  }

  /**
   * This method adds the given component to the swiper as the "container-start" component. This
   * component will be rendered before the "swiper-wrapper" element.
   *
   * @param component The component to add to the Swiper as the "container-start" component.
   */
  public void addContainerStartComponent(Div component) {
    component.getElement().setAttribute("slot", "container-start");
    getElement().appendChild(component.getElement());
  }

  /**
   * This method adds the given component to the swiper as the "container-end" component. This
   * component will be rendered after the "swiper-wrapper" element.
   *
   * @param component The component to add to the Swiper as the "container-end" component.
   */
  public void addContainerEndComponent(Div component) {
    component.getElement().setAttribute("slot", "container-end");
    getElement().appendChild(component.getElement());
  }

  /**
   * Sets the Attributes to the Swiper Web Component according to the given
   * {@link SwiperConfig config}.
   *
   * @param config The {@link SwiperConfig config} to configure the Swiper Web Component.
   */
  private void setConfigParams(SwiperConfig config) {
    Element selfRef = getElement();

    // Numbers to String because setAttribute only accepts booleans and Strings
    String slidesPerView = String.valueOf(config.getSlidesPerView());
    String speed = String.valueOf(config.getSpeed());
    String edgeSwipeThreshold = String.valueOf(config.getEdgeSwipeThreshold());
    String initialSlide = String.valueOf(config.getInitialSlide());
    String preloadPrevNext = String.valueOf(config.getLazyPreloadPrevNext());
    String longSwipesMs = String.valueOf(config.getLongSwipesMs());
    String longSwipesRatio = String.valueOf(config.getLongSwipesRatio());
    String loopedSlides = String.valueOf(config.getLoopedSlides());
    String maxBackfaceHiddenSlides = String.valueOf(config.getMaxBackfaceHiddenSlides());
    String resistanceRatio = String.valueOf(config.getResistanceRatio());
    String preventInteractionOnTransition = String.valueOf(
        config.isPreventInteractionOnTransition());
    String slidesOffsetAfter = String.valueOf(config.getSlidesOffsetAfter());
    String slidesOffsetBefore = String.valueOf(config.getSlidesOffsetBefore());
    String slidesPerGroup = String.valueOf(config.getSlidesPerGroup());
    String slidesPerGroupSkip = String.valueOf(config.getSlidesPerGroupSkip());
    String spaceBetween = String.valueOf(config.getSpaceBetween());
    String threshold = String.valueOf(config.getThreshold());
    String touchAngle = String.valueOf(config.getTouchAngle());
    String touchRatio = String.valueOf(config.getTouchRatio());

    boolean touchMovePropagation = config.isTouchMoveStopPropagation();
    boolean touchStartForcePrevDef = config.isTouchStartForcePreventDefault();
    boolean touchStartPreventDefault = config.isTouchStartPreventDefault();

    selfRef.setAttribute("slides-per-view", slidesPerView);
    selfRef.setAttribute("speed", speed);
    addBooleanAttribute(selfRef, "loop", config.isLoop());
    addBooleanAttribute(selfRef, "css-mode", config.isCssMode());
    addBooleanAttribute(selfRef, "navigation", config.isNavigation());
    addBooleanAttribute(selfRef, "pagination", config.isPagination());
    addBooleanAttribute(selfRef, "scrollbar", config.isScrollbar());
    addBooleanAttribute(selfRef, "virtual", config.isVirtual());
    addBooleanAttribute(selfRef, "allow-slide-next", config.isAllowSlideNext());
    addBooleanAttribute(selfRef, "allow-slide-prev", config.isAllowSlidePrev());
    addBooleanAttribute(selfRef, "allow-touch-move", config.isAllowTouchMove());
    addBooleanAttribute(selfRef, "auto-height", config.isAutoHeight());
    addBooleanAttribute(selfRef, "autoplay", config.isAutoplay());
    selfRef.setAttribute("breakpoint-base", config.getBreakpointBase().value);
    addBooleanAttribute(selfRef, "center-insufficient-slides", config.isCenterInsufficientSlides());
    addBooleanAttribute(selfRef, "centered-slides", config.isCenteredSlides());
    addBooleanAttribute(selfRef, "centered-slides-bounds", config.isCenteredSlidesBounds());
    selfRef.setAttribute("container-modifier-class", config.getContainerModifierClass());
    addBooleanAttribute(selfRef, "create-elements", config.isCreateElements());
    selfRef.setAttribute("direction", config.getDirection().value);
    addBooleanAttribute(selfRef, "edge-swipe-detection", config.isEdgeSwipeDetection());
    selfRef.setAttribute("edge-swipe-threshold", edgeSwipeThreshold);
    selfRef.setAttribute("effect", config.getEffect().value);
    addBooleanAttribute(selfRef, "enabled", config.isEnabled());
    selfRef.setAttribute("focusable-elements", config.getFocusableElements());
    addBooleanAttribute(selfRef, "follow-finger", config.isFollowFinger());
    addBooleanAttribute(selfRef, "free-mode", config.isFreeMode());
    addBooleanAttribute(selfRef, "grab-cursor", config.isGrabCursor());
    addBooleanAttribute(selfRef, "hash-navigation", config.isHashNavigation());
    addBooleanAttribute(selfRef, "init", config.isInit());
    selfRef.setAttribute("initial-slide", initialSlide);
    selfRef.setAttribute("lazy-preload-prev-next", preloadPrevNext);
    selfRef.setAttribute("lazy-preloader-class", config.getLazyPreloaderClass());
    addBooleanAttribute(selfRef, "long-swipes", config.isLongSwipes());
    selfRef.setAttribute("long-swipes-ms", longSwipesMs);
    selfRef.setAttribute("long-swipes-ratio", longSwipesRatio);
    addBooleanAttribute(selfRef, "loop-prevents-sliding", config.isLoopPreventsSliding());
    selfRef.setAttribute("looped-slides", loopedSlides);
    selfRef.setAttribute("max-backface-hidden-slides", maxBackfaceHiddenSlides);
    addBooleanAttribute(selfRef, "mousewheel", config.isMousewheel());
    addBooleanAttribute(selfRef, "nested", config.isNested());
    addBooleanAttribute(selfRef, "no-swiping", config.isNoSwiping());
    selfRef.setAttribute("no-swiping-class", config.getNoSwipingClass());
    addBooleanAttribute(selfRef, "normalize-slide-index", config.isNormalizeSlideIndex());
    addBooleanAttribute(selfRef, "observe-parents", config.isObserveParents());
    addBooleanAttribute(selfRef, "normalize-slide-index", config.isNormalizeSlideIndex());
    addBooleanAttribute(selfRef, "observe-parents", config.isObserveParents());
    addBooleanAttribute(selfRef, "observe-slide-children", config.isObserveSlideChildren());
    addBooleanAttribute(selfRef, "observer", config.isObserver());
    addBooleanAttribute(selfRef, "one-way-movement", config.isOneWayMovement());
    addBooleanAttribute(selfRef, "passive-listeners", config.isPassiveListeners());
    addBooleanAttribute(selfRef, "prevent-clicks", config.isPreventClicks());
    addBooleanAttribute(selfRef, "prevent-clicks-propagation", config.isPreventClicksPropagation());
    selfRef.setAttribute("prevent-interaction-on-transition", preventInteractionOnTransition);
    addBooleanAttribute(selfRef, "resistance", config.isResistance());
    selfRef.setAttribute("resistance-ratio", resistanceRatio);
    addBooleanAttribute(selfRef, "resize-observer", config.isResizeObserver());
    addBooleanAttribute(selfRef, "rewind", config.isRewind());
    addBooleanAttribute(selfRef, "round-lengths", config.isRoundLengths());
    addBooleanAttribute(selfRef, "run-callbacks-on-init", config.isRunCallbacksOnInit());
    addBooleanAttribute(selfRef, "set-wrapper-size", config.isSetWrapperSize());
    addBooleanAttribute(selfRef, "short-swipes", config.isShortSwipes());
    addBooleanAttribute(selfRef, "simulate-touch", config.isSimulateTouch());
    selfRef.setAttribute("slide-active-class", config.getSlideActiveClass());
    selfRef.setAttribute("slide-class", config.getSlideClass());
    selfRef.setAttribute("slide-next-class", config.getSlideNextClass());
    selfRef.setAttribute("slide-prev-class", config.getSlidePrevClass());
    addBooleanAttribute(selfRef, "slide-to-clicked-slide", config.isSlideToClickedSlide());
    selfRef.setAttribute("slide-visible-class", config.getSlideVisibleClass());
    selfRef.setAttribute("slides-offset-after", slidesOffsetAfter);
    selfRef.setAttribute("slides-offset-before", slidesOffsetBefore);
    selfRef.setAttribute("slides-per-group", slidesPerGroup);
    addBooleanAttribute(selfRef, "slides-per-group-auto", config.isSlidesPerGroupAuto());
    selfRef.setAttribute("slides-per-group-skip", slidesPerGroupSkip);
    selfRef.setAttribute("space-between", spaceBetween);
    selfRef.setAttribute("threshold", threshold);
    selfRef.setAttribute("touch-angle", touchAngle);
    selfRef.setAttribute("touch-events-target", config.getTouchEventsTarget().value);
    addBooleanAttribute(selfRef, "touch-move-stop-propagation", touchMovePropagation);
    selfRef.setAttribute("touch-ratio", touchRatio);
    addBooleanAttribute(selfRef, "touch-release-on-edges", config.isTouchReleaseOnEdges());
    addBooleanAttribute(selfRef, "touch-start-force-prevent-default", touchStartForcePrevDef);
    addBooleanAttribute(selfRef, "touch-start-prevent-default", touchStartPreventDefault);
    addBooleanAttribute(selfRef, "unique-nav-elements", config.isUniqueNavElements());
    addBooleanAttribute(selfRef, "update-on-window-resize", config.isUpdateOnWindowResize());
    addBooleanAttribute(selfRef, "virtual-translate", config.isVirtualTranslate());
    addBooleanAttribute(selfRef, "watch-overflow", config.isWatchOverflow());
    addBooleanAttribute(selfRef, "watch-slides-progress", config.isWatchSlidesProgress());
    selfRef.setAttribute("wrapper-class", config.getWrapperClass());
    addBooleanAttribute(selfRef, "zoom", config.isZoom());

    if (config.getHeight() != null) {
      String height = String.valueOf(config.getHeight());
      selfRef.setAttribute("height", height);
    }

    if (config.getNoSwipingSelector() != null) {
      String noSwipingSelector = config.getNoSwipingSelector();
      selfRef.setAttribute("no-swiping-selector", noSwipingSelector);
    }

    if (config.getUrl() != null) {
      String url = config.getUrl();
      selfRef.setAttribute("url", url);
    }

    if (config.getUserAgent() != null) {
      String userAgent = config.getUserAgent();
      selfRef.setAttribute("user-agent", userAgent);
    }

    if (config.getWidth() != null) {
      String width = String.valueOf(config.getWidth());
      selfRef.setAttribute("width", width);
    }
  }

  private void addBooleanAttribute(Element element, String name, boolean value) {
    element.setAttribute(name, String.valueOf(value));
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link ChangeDirectionEvent ChangeDirectionEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addChangeDirectionEventListener(
      ComponentEventListener<ChangeDirectionEvent> listener) {
    return super.addListener(ChangeDirectionEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link OrientationChangeEvent OrientationChangeEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addOrientationChangeEventListener(
      ComponentEventListener<OrientationChangeEvent> listener) {
    return super.addListener(OrientationChangeEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link ActiveIndexChangeEvent ActiveIndexChangeEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addActiveIndexChangeEventListener(
      ComponentEventListener<ActiveIndexChangeEvent> listener) {
    return super.addListener(ActiveIndexChangeEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link RealIndexChangeEvent RealIndexChangeEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addRealIndexChangeEventListener(
      ComponentEventListener<RealIndexChangeEvent> listener) {
    return super.addListener(RealIndexChangeEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link BeforeDestroyEvent BeforeDestroyEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addBeforeDestroyEventListener(
      ComponentEventListener<BeforeDestroyEvent> listener) {
    return super.addListener(BeforeDestroyEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link DestroyEvent DestroyEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addDestroyEventListener(ComponentEventListener<DestroyEvent> listener) {
    return super.addListener(DestroyEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link AfterInitEvent AfterInitEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addAfterInitEventListener(ComponentEventListener<AfterInitEvent> listener) {
    return super.addListener(AfterInitEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link BeforeInitEvent BeforeInitEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addBeforeInitEventListener(ComponentEventListener<BeforeInitEvent> listener) {
    return super.addListener(BeforeInitEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link InitEvent InitEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addInitEventListener(ComponentEventListener<InitEvent> listener) {
    return super.addListener(InitEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link LockEvent LockEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addLockEventListener(ComponentEventListener<LockEvent> listener) {
    return super.addListener(LockEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link UnlockEvent UnlockEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addUnlockEventListener(ComponentEventListener<UnlockEvent> listener) {
    return super.addListener(UnlockEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link BeforeLoopFixEvent BeforeLoopFixEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addBeforeLoopFixEventListener(
      ComponentEventListener<BeforeLoopFixEvent> listener) {
    return super.addListener(BeforeLoopFixEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link LoopFixEvent LoopFixEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addLoopFixEventListener(ComponentEventListener<LoopFixEvent> listener) {
    return super.addListener(LoopFixEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link BeforeResizeEvent BeforeResizeEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addBeforeResizeEventListener(
      ComponentEventListener<BeforeResizeEvent> listener) {
    return super.addListener(BeforeResizeEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link ResizeEvent ResizeEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addResizeEventListener(ComponentEventListener<ResizeEvent> listener) {
    return super.addListener(ResizeEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link BeforeSlideChangeStartEvent BeforeSlideChangeStartEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addBeforeSlideChangeStartEventListener(
      ComponentEventListener<BeforeSlideChangeStartEvent> listener) {
    return super.addListener(BeforeSlideChangeStartEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link SlideChangeEvent SlideChangeEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addSlideChangeEventListener(
      ComponentEventListener<SlideChangeEvent> listener) {
    return super.addListener(SlideChangeEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link SlideChangeTransitionEndEvent SlideChangeTransitionEndEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addSlideChangeTransitionEndEventListener(
      ComponentEventListener<SlideChangeTransitionEndEvent> listener) {
    return super.addListener(SlideChangeTransitionEndEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link SlideChangeTransitionStartEvent SlideChangeTransitionStartEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addSlideChangeTransitionStartEventListener(
      ComponentEventListener<SlideChangeTransitionStartEvent> listener) {
    return super.addListener(SlideChangeTransitionStartEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link SlideNextTransitionEndEvent SlideNextTransitionEndEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addSlideNextTransitionEndEventListener(
      ComponentEventListener<SlideNextTransitionEndEvent> listener) {
    return super.addListener(SlideNextTransitionEndEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link SlideNextTransitionStartEvent SlideNextTransitionStartEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addSlideNextTransitionStartEventListener(
      ComponentEventListener<SlideNextTransitionStartEvent> listener) {
    return super.addListener(SlideNextTransitionStartEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link SlidePrevTransitionEndEvent SlidePrevTransitionEndEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addSlidePrevTransitionEndEventListener(
      ComponentEventListener<SlidePrevTransitionEndEvent> listener) {
    return super.addListener(SlidePrevTransitionEndEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link SlidePrevTransitionStartEvent SlidePrevTransitionStartEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addSlidePrevTransitionStartEventListener(
      ComponentEventListener<SlidePrevTransitionStartEvent> listener) {
    return super.addListener(SlidePrevTransitionStartEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link SlideResetTransitionEndEvent SlideResetTransitionEndEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addSlideResetTransitionEndEventListener(
      ComponentEventListener<SlideResetTransitionEndEvent> listener) {
    return super.addListener(SlideResetTransitionEndEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link SlideResetTransitionStartEvent SlideResetTransitionStartEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addSlideResetTransitionStartEventListener(
      ComponentEventListener<SlideResetTransitionStartEvent> listener) {
    return super.addListener(SlideResetTransitionStartEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link ClickEvent ClickEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addClickEventListener(ComponentEventListener<ClickEvent> listener) {
    return super.addListener(ClickEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link DoubleClickEvent DoubleClickEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addDoubleClickEventListener(
      ComponentEventListener<DoubleClickEvent> listener) {
    return super.addListener(DoubleClickEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link DoubleTapEvent DoubleTapEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addDoubleTapEventListener(ComponentEventListener<DoubleTapEvent> listener) {
    return super.addListener(DoubleTapEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for {@link TapEvent TapEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addTapEventListener(ComponentEventListener<TapEvent> listener) {
    return super.addListener(TapEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link TouchEndEvent TouchEndEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addTouchEndEventListener(ComponentEventListener<TouchEndEvent> listener) {
    return super.addListener(TouchEndEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link TouchMoveEvent TouchMoveEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addTouchMoveEventListener(ComponentEventListener<TouchMoveEvent> listener) {
    return super.addListener(TouchMoveEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link TouchMoveOppositeEvent TouchMoveOppositeEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addTouchMoveOppositeEventListener(
      ComponentEventListener<TouchMoveOppositeEvent> listener) {
    return super.addListener(TouchMoveOppositeEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link TouchStartEvent TouchStartEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addTouchStartEventListener(ComponentEventListener<TouchStartEvent> listener) {
    return super.addListener(TouchStartEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link BeforeTransitionStartEvent BeforeTransitionStartEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addBeforeTransitionStartEventListener(
      ComponentEventListener<BeforeTransitionStartEvent> listener) {
    return super.addListener(BeforeTransitionStartEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link SetTransitionEvent SetTransitionEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addSetTransitionEventListener(
      ComponentEventListener<SetTransitionEvent> listener) {
    return super.addListener(SetTransitionEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link TransitionEndEvent TransitionEndEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addTransitionEndEventListener(
      ComponentEventListener<TransitionEndEvent> listener) {
    return super.addListener(TransitionEndEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link TransitionStartEvent TransitionStartEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addTransitionStartEventListener(
      ComponentEventListener<TransitionStartEvent> listener) {
    return super.addListener(TransitionStartEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link BreakpointEvent BreakpointEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addBreakpointEventListener(ComponentEventListener<BreakpointEvent> listener) {
    return super.addListener(BreakpointEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link FromEdgeEvent FromEdgeEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addFromEdgeEventListener(ComponentEventListener<FromEdgeEvent> listener) {
    return super.addListener(FromEdgeEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link MomentumBounceEvent MomentumBounceEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addMomentumBounceEventListener(
      ComponentEventListener<MomentumBounceEvent> listener) {
    return super.addListener(MomentumBounceEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link ObserverUpdateEvent ObserverUpdateEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addObserverUpdateEventListener(
      ComponentEventListener<ObserverUpdateEvent> listener) {
    return super.addListener(ObserverUpdateEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link ProgressEvent ProgressEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addProgressEventListener(ComponentEventListener<ProgressEvent> listener) {
    return super.addListener(ProgressEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link ReachBeginningEvent ReachBeginningEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addReachBeginningEventListener(
      ComponentEventListener<ReachBeginningEvent> listener) {
    return super.addListener(ReachBeginningEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link ReachEndEvent ReachEndEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addReachEndEventListener(ComponentEventListener<ReachEndEvent> listener) {
    return super.addListener(ReachEndEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link SetTranslateEvent SetTranslateEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addSetTranslateEventListener(
      ComponentEventListener<SetTranslateEvent> listener) {
    return super.addListener(SetTranslateEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link SliderFirstMoveEvent SliderFirstMoveEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addSliderFirstMoveEventListener(
      ComponentEventListener<SliderFirstMoveEvent> listener) {
    return super.addListener(SliderFirstMoveEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link SliderMoveEvent SliderMoveEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addSliderMoveEventListener(ComponentEventListener<SliderMoveEvent> listener) {
    return super.addListener(SliderMoveEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link SlidesGridLengthChangeEvent SlidesGridLengthChangeEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addSlidesGridLengthChangeEventListener(
      ComponentEventListener<SlidesGridLengthChangeEvent> listener) {
    return super.addListener(SlidesGridLengthChangeEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link SlidesLengthChangeEvent SlidesLengthChangeEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addSlidesLengthChangeEventListener(
      ComponentEventListener<SlidesLengthChangeEvent> listener) {
    return super.addListener(SlidesLengthChangeEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link SnapGridLengthChangeEvent SnapGridLengthChangeEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addSnapGridLengthChangeEventListener(
      ComponentEventListener<SnapGridLengthChangeEvent> listener) {
    return super.addListener(SnapGridLengthChangeEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link SnapIndexChangeEvent SnapIndexChangeEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addSnapIndexChangeEventListener(
      ComponentEventListener<SnapIndexChangeEvent> listener) {
    return super.addListener(SnapIndexChangeEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link ToEdgeEvent ToEdgeEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addToEdgeEventListener(ComponentEventListener<ToEdgeEvent> listener) {
    return super.addListener(ToEdgeEvent.class, listener);
  }

  /**
   * Adds a {@link ComponentEventListener} to the Swiper to listen for
   * {@link UpdateEvent UpdateEvents}.
   *
   * @param listener The {@link ComponentEventListener} to add.
   * @return The {@link Registration} for the {@link ComponentEventListener} that can be used to
   * remove the listener.
   */
  public Registration addUpdateEventListener(ComponentEventListener<UpdateEvent> listener) {
    return super.addListener(UpdateEvent.class, listener);
  }

  /**
   * Run transition to the next {@link Slide}.
   *
   * @param speed        The transition duration (in ms).
   * @param runCallbacks The transition will not be run if set to false.
   */
  public void slideNext(int speed, boolean runCallbacks) {
    getElement().callJsFunction("swiper.slideNext", speed, runCallbacks);
  }

  /**
   * Run transition to next {@link Slide}.
   *
   * @param speed The transition duration (in ms).
   */
  public void slideNext(int speed) {
    getElement().callJsFunction("swiper.slideNext", speed);
  }

  /**
   * Run transition to next {@link Slide}.
   */
  public void slideNext() {
    getElement().callJsFunction("swiper.slideNext");
  }

  /**
   * Run transition to the previous {@link Slide}.
   *
   * @param speed        The transition duration (in ms).
   * @param runCallbacks The transition will not be run if set to false.
   */
  public void slidePrev(int speed, boolean runCallbacks) {
    getElement().callJsFunction("swiper.slidePrev", speed, runCallbacks);
  }

  /**
   * Run transition to the previous {@link Slide}.
   *
   * @param speed The transition duration (in ms).
   */
  public void slidePrev(int speed) {
    getElement().callJsFunction("swiper.slidePrev", speed);
  }

  /**
   * Swipes to the previous {@link Slide}.
   */
  public void slidePrev() {
    getElement().callJsFunction("swiper.slidePrev");
  }

  /**
   * Returns the current {@link Slide} index.
   *
   * @return The current {@link Slide} index.
   */
  public int getActiveIndex() {
    return activeIndex;
  }

  /**
   * Attach all events listeners again
   */
  public void attachEvents() {
    getElement().callJsFunction("swiper.attachEvents");
  }

  /**
   * Changes slider direction from horizontal to vertical and back.
   *
   * @param direction  The new {@link Direction}
   * @param needUpdate If true, {#update()} will be called internally.
   */
  public void changeDirection(Direction direction, boolean needUpdate) {
    getElement().callJsFunction("swiper.changeDirection", direction.value, needUpdate);
  }

  /**
   * Changes the Swiper's {@link LanguageDirection}.
   *
   * @param direction The new {@link LanguageDirection}
   */
  public void changeLanguageDirection(LanguageDirection direction) {
    getElement().callJsFunction("swiper.changeLanguageDirection", direction.value);
    this.languageDirection = direction;
  }

  /**
   * Destroy Swiper instance and detach all event listeners.
   *
   * @param deleteInstance If true, Swiper instance will be deleted completely.
   * @param cleanStyles    If true, all custom styles will be removed from slides, wrappers and the
   *                       container. Useful if you need to destroy Swiper and to init again with
   *                       new options or in a different direction.
   */
  public void destroy(boolean deleteInstance, boolean cleanStyles) {
    getElement().callJsFunction("swiper.destroy", deleteInstance, cleanStyles);
  }

  /**
   * Detach all event listeners.
   */
  public void detachEvents() {
    getElement().callJsFunction("swiper.detachEvents");
  }

  /**
   * Disable Swiper (if it was enabled). When Swiper is disabled it will hide all navigation
   * elements and won't respond to any events and interactions.
   */
  public void disable() {
    getElement().callJsFunction("swiper.disable");
  }

  /**
   * Fire event on instance
   *
   * @param event event name
   * @param args  event arguments
   */
  public void emit(String event, Serializable... args) {
    getElement().callJsFunction("swiper.emit", event, args);
  }

  /**
   * Enable Swiper (if it was disabled).
   */
  public void enable() {
    getElement().callJsFunction("swiper.enable");
  }

  /**
   * Initialize Swiper
   */
  public void init() {
    getElement().callJsFunction("swiper.init");
  }

  /**
   * Set grab cursor.
   */
  public void setGrabCursor() {
    getElement().callJsFunction("swiper.setGrabCursor");
  }

  /**
   * Set Swiper translate progress (from 0 to 1). Where 0 - its initial position (offset) on first
   * slide, and 1 - its maximum position (offset) on last slide
   *
   * @param progress Swiper translate progress (from 0 to 1)
   * @param speed    Transition duration (in ms).
   * @throws IllegalArgumentException if progress is not between 0 and 1
   * @throws IllegalArgumentException if speed is less than 0
   */
  public void setProgress(float progress, int speed) {
    if (progress < 0 || progress > 1) {
      throw new IllegalArgumentException("Progress must be between 0 and 1");
    }

    if (speed < 0) {
      throw new IllegalArgumentException("Speed must be greater than 0");
    }
  }

  /**
   * Reset swiper position to currently active {@link Slide} for the duration equal to the 'speed'
   * parameter.
   *
   * @param speed        Transition duration (in ms).
   * @param runCallbacks Set it to false and transitions will not produce transition events.
   */
  public void slideReset(int speed, boolean runCallbacks) {
    getElement().callJsFunction("swiper.slideReset", speed, runCallbacks);
  }

  /**
   * Reset swiper position to currently active {@link Slide} for the duration equal to the 'speed'
   * parameter.
   *
   * @param speed Transition duration (in ms).
   */
  public void slideReset(int speed) {
    getElement().callJsFunction("swiper.slideReset", speed);
  }

  /**
   * Reset swiper position to currently active {@link Slide} for the duration equal to the 'speed'
   * parameter.
   */
  public void slideReset() {
    getElement().callJsFunction("swiper.slideReset");
  }

  /**
   * Run transition to the slide with index number equal to 'index' parameter for the duration equal
   * to the 'speed' parameter.
   *
   * @param index        The index of the {@link Slide} to slide to.
   * @param speed        Transition duration (in ms).
   * @param runCallbacks Set it to false and the transition will not produce transition events.
   */
  public void slideTo(int index, int speed, boolean runCallbacks) {
    getElement().callJsFunction("swiper.slideTo", index, speed, runCallbacks);
  }

  /**
   * Run transition to the slide with index number equal to 'index' parameter for the duration equal
   * to the 'speed' parameter.
   *
   * @param index The index of the {@link Slide} to slide to.
   * @param speed Transition duration (in ms).
   */
  public void slideTo(int index, int speed) {
    getElement().callJsFunction("swiper.slideTo", index, speed);
  }

  /**
   * Run transition to the slide with index number equal to 'index' parameter for the duration equal
   * to the 'speed' parameter.
   *
   * @param index The index of the {@link Slide} to slide to.
   */
  public void slideTo(int index) {
    getElement().callJsFunction("swiper.slideTo", index);
  }

  /**
   * Reset Swiper position to closest {@link Slide}/Snap Point for the duration equal to the 'speed'
   * parameter.
   *
   * @param speed        Transition duration (in ms).
   * @param runCallbacks Set it to false and the transition will not produce transition events.
   */
  public void slideToClosest(int speed, boolean runCallbacks) {
    getElement().callJsFunction("swiper.slideToClosest", speed, runCallbacks);
  }

  /**
   * Reset Swiper position to closest {@link Slide}/Snap Point for the duration equal to the 'speed'
   * parameter.
   *
   * @param speed Transition duration (in ms).
   */
  public void slideToClosest(int speed) {
    getElement().callJsFunction("swiper.slideToClosest", speed);
  }

  /**
   * Reset Swiper position to closest {@link Slide}/Snap Point for the duration equal to the 'speed'
   * parameter.
   */
  public void slideToClosest() {
    getElement().callJsFunction("swiper.slideToClosest");
  }

  /**
   * Does the same as {@link #slideTo(int, int, boolean)} but for the case when used with
   * {@link SwiperConfig#isLoop()} option enabled. So this method will slide to slides with
   * "realIndex" matching to passed index.
   *
   * @param index        The index of the {@link Slide} to slide to.
   * @param speed        Transition duration (in ms).
   * @param runCallbacks Set it to false and the transition will not produce transition events.
   */
  public void slideToLoop(int index, int speed, boolean runCallbacks) {
    getElement().callJsFunction("swiper.slideToLoop", index, speed, runCallbacks);
  }

  /**
   * Does the same as {@link #slideTo(int, int)} but for the case when used with
   * {@link SwiperConfig#isLoop()} option enabled. So this method will slide to slides with
   * "realIndex" matching to passed index.
   *
   * @param index The index of the {@link Slide} to slide to.
   * @param speed Transition duration (in ms).
   */
  public void slideToLoop(int index, int speed) {
    getElement().callJsFunction("swiper.slideToLoop", index, speed);
  }

  /**
   * Does the same as {@link #slideTo(int)} but for the case when used with
   * {@link SwiperConfig#isLoop()} option enabled. So this method will slide to slides with
   * "realIndex" matching to passed index.
   *
   * @param index The index of the {@link Slide} to slide to.
   */
  public void slideToLoop(int index) {
    getElement().callJsFunction("swiper.slideToLoop", index);
  }

  /**
   * Animate custom css3 transform's translate value for Swiper wrapper.
   *
   * @param translate       Translate value (in px).
   * @param speed           Transition duration (in ms).
   * @param runCallbacks    Set it to false and the transition will not produce transition events.
   * @param translateBounds Set it to false and the transition value can extend beyond min and max
   *                        translate.
   */
  public void translateTo(int translate, int speed, boolean runCallbacks,
      boolean translateBounds) {
    getElement().callJsFunction("swiper.translateTo", translate, speed, runCallbacks,
        translateBounds);
  }

  /**
   * Animate custom css3 transform's translate value for Swiper wrapper.
   *
   * @param translate    Translate value (in px).
   * @param speed        Transition duration (in ms).
   * @param runCallbacks Set it to false and the transition will not produce transition events.
   */
  public void translateTo(int translate, int speed, boolean runCallbacks) {
    getElement().callJsFunction("swiper.translateTo", translate, speed, runCallbacks);
  }

  /**
   * Animate custom css3 transform's translate value for Swiper wrapper.
   *
   * @param translate Translate value (in px).
   * @param speed     Transition duration (in ms).
   */
  public void translateTo(int translate, int speed) {
    getElement().callJsFunction("swiper.translateTo", translate, speed);
  }

  /**
   * Animate custom css3 transform's translate value for Swiper wrapper.
   *
   * @param translate Translate value (in px).
   */
  public void translateTo(int translate) {
    getElement().callJsFunction("swiper.translateTo", translate);
  }

  /**
   * Unset grab cursor.
   */
  public void unsetGrabCursor() {
    getElement().callJsFunction("swiper.unsetGrabCursor");
  }

  /**
   * You should call it after you
   * <ul>
   *   <li>add or remove slides manually</li>
   *   <li>hide or show the Swiper</li>
   *   <li>do any custom DOM modifications with Swiper</li>
   * </ul>
   * <p>
   * This method also includes a subcall of the following methods which you can use seperately:
   * <ul>
   *   <li>{@link Swiper#updateAutoHeight()}</li>
   *   <li>{@link Swiper#updateProgress}</li>
   *   <li>{@link Swiper#updateSize}</li>
   *   <li>{@link Swiper#updateSlides}</li>
   *   <li>{@link Swiper#updateSlidesClasses}</li>
   * </ul>
   */
  public void update() {
    getElement().callJsFunction("swiper.update");
  }

  /**
   * Force Swiper to update its height (when autoHeight is enabled) for the duration equal to the
   * 'speed' parameter.
   *
   * @param speed Transition duration (in ms).
   */
  public void updateAutoHeight(int speed) {
    getElement().callJsFunction("swiper.updateAutoHeight", speed);
  }

  /**
   * Force Swiper to update its height (when autoHeight is enabled) for the duration equal to the
   * 'speed' parameter.
   */
  public void updateAutoHeight() {
    getElement().callJsFunction("swiper.updateAutoHeight");
  }

  /**
   * Recalculate swiper progress.
   */
  public void updateProgress() {
    getElement().callJsFunction("swiper.updateProgress");
  }

  /**
   * Recalculate size of swiper container.
   */
  public void updateSize() {
    getElement().callJsFunction("swiper.updateSize");
  }

  /**
   * Recalculate number of slides and their offsets. Useful after you add/remove slides with
   * JavaScript.
   */
  public void updateSlides() {
    getElement().callJsFunction("swiper.updateSlides");
  }

  /**
   * Update active/prev/next classes on slides and bullets.
   */
  public void updateSlidesClasses() {
    getElement().callJsFunction("swiper.updateSlidesClasses");
  }

  /**
   * Returns the current {@link LanguageDirection language direction} of the Swiper. This value is
   * NOT updated when the DOM is manipulated directly.
   *
   * @return The current {@link LanguageDirection language direction} of the Swiper.
   */
  public LanguageDirection getLanguageDirection() {
    return languageDirection;
  }
}
