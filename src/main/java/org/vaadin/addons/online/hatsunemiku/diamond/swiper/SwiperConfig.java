package org.vaadin.addons.online.hatsunemiku.diamond.swiper;

import org.vaadin.addons.online.hatsunemiku.diamond.swiper.constants.BreakpointsBase;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.constants.Direction;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.constants.Effect;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.constants.TouchEventsTarget;
import org.vaadin.addons.online.hatsunemiku.diamond.swiper.event.slide.SlideChangeEvent;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Builder
public class SwiperConfig {
  /**
   * Number of slides per view (slides visible at the same time on slider's container). Set to -1
   * for 'auto'
   * <br> <br>
   * 'slidesPerView: `auto`' is currently not compatible with multirow mode, when 'grid.rows' > 1
   */
  @Default
  private int slidesPerView = 1;
  /**
   * Duration of transition between slides (in ms)
   */
  @Default
  private long speed = 300;
  /**
   * Set to 'true' to enable continuous loop mode
   * <br> <br>
   * Because of the nature of how the loop mode works (it will rearrange slides), the total number
   * of slides must be >= {@link SwiperConfig#slidesPerView} * 2
   */
  @Default
  private boolean loop = false;
  /**
   * When enabled the {@link Swiper} will use the modern CSS Scroll Snap API. It doesn't support all
   * of Swiper's features, but can potentially improve performance in simple configurations.
   * <p>
   * Should not be used if you use:
   * <ul>
   *   <li> the Cube Effect.</li>
   *   <li> the {@link SwiperConfig#speed} parameter.</li>
   *   <li> any transition start/end events. Use {@link SlideChangeEvent} instead</li>
   *   <li> {@link SwiperConfig#slidesPerGroup}</li>
   *   <li> {@link SwiperConfig#resistance}</li>
   *   <li> {@link SwiperConfig#allowSlideNext} or {@link SwiperConfig#allowSlidePrev}</li>
   *   <li> swipeHandler</li>
   * </ul>
   */
  @Default
  private boolean cssMode = false;
  /**
   * Enables navigation.
   */
  @Default
  private boolean navigation = false;
  /**
   * Enables pagination.
   */
  @Default
  private boolean pagination = false;
  /**
   * Enables scrollbar.
   */
  @Default
  private boolean scrollbar = false;
  /**
   * Enables lazy loading.
   */
  @Default
  private boolean lazy = false;
  /**
   * Enables virtual slides functionality. Read the <a
   * href="https://swiperjs.com/swiper-api#virtual">Swiper.js documentation</a> for more
   * information.
   */
  @Default
  private boolean virtual = false;

  /**
   * Set to "false" to disable swiping to next slide direction (to right or bottom depending on the
   * direction)
   */
  @Default
  private boolean allowSlideNext = true;
  /**
   * Set to "false" to disable swiping to prev slide direction (to left or top depending on the
   * direction)
   */
  @Default
  private boolean allowSlidePrev = true;
  /**
   * If false, then the only way to switch the slide is use of external API functions like
   * {@link Swiper#slideNext()} or {@link Swiper#slidePrev()}.
   */
  @Default
  private boolean allowTouchMove = true;
  /**
   * Set to 'true' and the slider wrapper will adapt its height to the height of the currently
   * active slide.
   */
  @Default
  private boolean autoHeight = false;
  /**
   * Set to 'true' to enable autoplay mode
   */
  @Default
  private boolean autoplay = false;
  /**
   * Base for breakpoints (beta). Can be {@link BreakpointsBase#WINDOW} or
   * {@link BreakpointsBase#CONTAINER}. If set to {@link BreakpointsBase#WINDOW} (default value)
   * then breakpoint keys mean window width. If set to {@link BreakpointsBase#CONTAINER} then
   * breakpoint keys are treated as swiper container width.
   */
  @Default
  private BreakpointsBase breakpointBase = BreakpointsBase.WINDOW;
  /**
   * When set to 'true' the {@link Slide Slides} will be centered if the amount of slides is less
   * than {@link SwiperConfig#slidesPerView slidesPerView}. This should not be used together with
   * {@link SwiperConfig#loop loop} mode.
   */
  @Default
  private boolean centerInsufficientSlides = false;
  /**
   * If 'true', then the active {@link Slide} will be centered, not always on the left side.
   */
  @Default
  private boolean centeredSlides = false;
  /**
   * If 'true', then the active {@link Slide} will be centered without adding gaps at the beginning
   * and end of the Slider. If this is set to 'true', then {@link SwiperConfig#centeredSlides} has
   * to be set to true too.
   */
  @Default
  private boolean centeredSlidesBounds = false;
  /**
   * The beginning of the Modifier CSS class that can be added to the {@link Swiper} container,
   * depending on different parameters.
   */
  @Default
  @NonNull
  private String containerModifierClass = "swiper-";
  /**
   * If 'true', the {@link Swiper} will automatically wrap slides with swiper-wrapper element, and
   * will create required elements for navigation, pagination and scrollbar.
   */
  @Default
  private boolean createElements = false;
  /**
   * Whether the {@link Swiper} should be vertically or horizontally oriented.
   */
  @Default
  @NonNull
  private Direction direction = Direction.HORIZONTAL;
  /**
   * If 'true', the {@link Swiper} will release events for swipe-back.
   */
  @Default
  private boolean edgeSwipeDetection = false;
  /**
   * Area (in px) from the left edge of the screen to release the swipe-to-go-back effect.
   */
  @Default
  private int edgeSwipeThreshold = 20;
  /**
   * Transition effect. Can be any values of {@link Effect}
   */
  @Default
  @NonNull
  private Effect effect = Effect.SLIDE;
  /**
   * Whether {@link Swiper} is initially enabled. When {@link Swiper} is disabled, it will hide all
   * navigation elements and won't respond to any events and interactions.
   */
  @Default
  private boolean enabled = true;
  /**
   * CSS selector for focusable elements. Swiping will be disabled on such elements if they are
   * "focused".
   */
  @Default
  @NonNull
  private String focusableElements = "input, select, option, textarea, button, video, label";
  /**
   * If 'false', then the slider will be animated only when the user releases touch. Meaning it will
   * not move while you hold your finger on it.
   */
  @Default
  private boolean followFinger = true;
  /**
   * Enables free mode functionality.
   */
  @Default
  private boolean freeMode = false;
  /**
   * This option may improve desktop usability a little. If 'true', the user will see the "grab"
   * cursor when hovering on {@link Swiper}.
   */
  @Default
  private boolean grabCursor = false;
  /**
   * Enables hash url navigation for {@link Slide slides}.
   */
  @Default
  private boolean hashNavigation = false;
  /**
   * {@link Swiper} height (in px). This parameter allows to force {@link Swiper Swiper's} height.
   * Useful only if you initialize {@link Swiper} when it is hidden and in SSR and Test Environments
   * for correct {@link Swiper} initialization. Set to 'null' to revert to the default behavior of
   * calculating height based on slides and CSS.
   */
  @Default
  private Integer height = null;
  /**
   * Whether {@link Swiper} should be initialised automatically when you create an instance. If
   * 'false', then you need to init it manually by calling {@link Swiper#init()} method.
   */
  @Default
  private boolean init = true;
  /**
   * Index number of the initial slide.
   */
  @Default
  private int initialSlide = 0;
  /**
   * Number of next and previous slides to preload. Only applicable if {@link SwiperConfig#lazy} is
   * set to 'true'.
   */
  @Default
  private int lazyPreloadPrevNext = 0;
  /**
   * CSS class name of lazy preloader element.
   */
  @Default
  @NonNull
  private String lazyPreloaderClass = "swiper-lazy-preloader";
  /**
   * Set to 'false' if you want to disable long swipes.
   */
  @Default
  private boolean longSwipes = true;
  /**
   * Minimal duration (in ms) to trigger swipe to next/previous slide during long swipes.
   */
  @Default
  private int longSwipesMs = 300;
  /**
   * Ratio to trigger swipe to next/previous slide during long swipes.
   */
  @Default
  private float longSwipesRatio = 0.5f;
  /**
   * If 'true', then {@link Swiper#slidePrev() prevSlide()}/{@link Swiper#slideNext() nextSlide()}
   * will do nothing while slider is animating in loop mode.
   */
  @Default
  private boolean loopPreventsSliding = true;
  /**
   * Defines how many slides before the end/beginning it should rearrange (loop) slides. If set to
   * 'null', defaults to {@link #slidesPerView}.
   */
  @Default
  private Integer loopedSlides = null;
  /**
   * If the total number of slides is less than the specified value, then {@link Swiper} will enable
   * 'backface-visibility: hidden' on slide elements to reduce visual "flicker" in safari.
   * <br> <br>
   * <b>Note: It is not recommended to use a large value for this parameter as it will reduce
   * performance </b>
   */
  @Default
  private int maxBackfaceHiddenSlides = 10;
  /**
   * Enables navigation through {@link Slide slides} using the mouse wheel.
   */
  @Default
  private boolean mousewheel = false;
  /**
   * Set to 'true' for correct touch events interception. Use only on {@link Swiper swipers} that
   * use the same direction as the parent one.
   */
  @Default
  private boolean nested = false;
  /**
   * Enables/disables swiping on elements matched to class specified in {@link #noSwipingClass}.
   */
  @Default
  private boolean noSwiping = true;
  /**
   * Specify {@link #noSwiping}'s element css class
   */
  @Default
  @NonNull
  private String noSwipingClass = "swiper-no-swiping";
  /**
   * Can be used instead of {@link #noSwipingClass} to specify elements to disable swiping on. For
   * example `'input'` will disable swiping on all inputs.
   */
  @Default
  private String noSwipingSelector = null;
  /**
   * Normalize the slide index.
   */
  @Default
  private boolean normalizeSlideIndex = true;
  /**
   * Set to 'true' if you also need to watch Mutations for {@link Swiper} parent elements
   */
  @Default
  private boolean observeParents = false;
  /**
   * Set to 'true' if you also need to watch Mutations for {@link Swiper} slide children elements
   */
  @Default
  private boolean observeSlideChildren = false;
  /**
   * Set to 'true' to enable Mutation Observer for {@link Swiper} and its elements. In this case the
   * {@link Swiper} will be updated (reinitialized) each time if you change its style (like
   * hide/show) or modify its child elements (like adding/removing {@link Slide slides}).
   */
  @Default
  private boolean observer = true;
  /**
   * If 'true', swiping is only possible 'forward', regardless of the direction.
   */
  @Default
  private boolean oneWayMovement = false;
  /**
   * Passive event listeners will be used by default where possible to improve scrolling performance
   * on mobile devices. But if you need to use 'e.preventDefault' and you have a conflict with it,
   * then you should disable this parameter.
   */
  @Default
  private boolean passiveListeners = true;
  /**
   * Set to 'true' to prevent accidental unwanted clicks on links during swiping.
   */
  @Default
  private boolean preventClicks = true;
  /**
   * Set to 'true' to stop clicks event propagation on links during swiping.
   */
  @Default
  private boolean preventClicksPropagation = true;
  /**
   * When set to 'true' it won't allow to change slides by swiping or navigation/pagination buttons
   * during transition.
   */
  @Default
  private boolean preventInteractionOnTransition = false;
  /**
   * Set to 'false' if you want to disable resistant bounds.
   */
  @Default
  private boolean resistance = true;
  /**
   * This parameter allows you to control the resistance ratio.
   */
  @Default
  private float resistanceRatio = 0.85f;
  /**
   * When enabled it will use ResizeObserver (if supported by the browser) on the {@link Swiper}
   * container to detect container resize (instead of watching for window resize)
   */
  @Default
  private boolean resizeObserver = true;
  /**
   * Set to 'true' to enable "rewind" mode. When enabled, clicking the "next" navigation button (or
   * calling {@link Swiper#slideNext()}) when on the last {@link Slide} will slide back to the first
   * {@link Slide}. Clicking the "prev" navigation button (or calling {@link Swiper#slidePrev()})
   * when on the first {@link Slide} will slide forward to the last {@link Slide}.
   */
  @Default
  private boolean rewind = false;
  /**
   * Set to 'true' to round values of slides width and height to prevent blurry texts on usual
   * resolution screens.
   */
  @Default
  private boolean roundLengths = false;
  /**
   * Fire Transition/SlideChange/Start/End events on swiper initialization. Such events will be
   * fired on initialization in case of your {@link #initialSlide} is not 0, or you use
   * {@link #loop} mode
   */
  @Default
  private boolean runCallbacksOnInit = true;
  /**
   * Enable this option and the plugin will set width/height on the {@link Swiper} wrapper equal to
   * total size of all slides. Mostly should be used as compatibility fallback option for browsers
   * that don't support flexbox layout well.
   */
  @Default
  private boolean setWrapperSize = false;
  /**
   * Set to 'false' if you want to disable short swipes.
   */
  @Default
  private boolean shortSwipes = true;
  /**
   * If 'true', {@link Swiper} will accept mouse events like touch events (click and drag to change
   * {@link Slide slides})
   */
  @Default
  private boolean simulateTouch = true;
  /**
   * CSS class name of currently active {@link Slide}
   * <br> <br>
   * By changing this parameter you will also need to change {@link Swiper Swiper's} CSS to reflect
   * changed classes
   */
  @Default
  @NonNull
  private String slideActiveClass = "swiper-slide-active";
  /**
   * CSS class name of {@link Slide}
   * <br> <br>
   * By changing this parameter you will also need to change {@link Swiper Swiper's} CSS to reflect
   * changed classes
   */
  @Default
  @NonNull
  private String slideClass = "swiper-slide";
  /**
   * CSS class name of the {@link Slide} which is right after the currently active {@link Slide}
   * <br> <br>
   * By changing this parameter you will also need to change {@link Swiper Swiper's} CSS to reflect
   * changed classes
   */
  @Default
  @NonNull
  private String slideNextClass = "swiper-slide-next";
  /**
   * CSS class name of the {@link Slide} which is right before the currently active {@link Slide}
   * <br> <br>
   * By changing this parameter you will also need to change {@link Swiper Swiper's} CSS to reflect
   * changed classes
   */
  @Default
  @NonNull
  private String slidePrevClass = "swiper-slide-prev";
  /**
   * Set to 'true' and click on any {@link Slide slide} will produce a transition to this
   * {@link Slide slide}.
   */
  @Default
  private boolean slideToClickedSlide = false;
  /**
   * CSS class name of currently visible {@link Slide slide}
   * <br> <br>
   * By changing this parameter you will also need to change {@link Swiper Swiper's} CSS to reflect
   * changed classes
   */
  @Default
  @NonNull
  private String slideVisibleClass = "swiper-slide-visible";
  /**
   * Add (in px) additional {@link Slide} offset at the end of the container (after all
   * {@link Slide slides})
   */
  @Default
  private int slidesOffsetAfter = 0;
  /**
   * Add (in px) additional {@link Slide} offset at the beginning of the container (before all
   * {@link Slide slides})
   */
  @Default
  private int slidesOffsetBefore = 0;
  /**
   * Set number of {@link Slide slides} to define and enable group sliding. Useful to use with
   * {@link #slidesPerView} > 1
   */
  @Default
  private int slidesPerGroup = 1;
  /**
   * This parameter is intended to be used with '{@link #slidesPerView}: auto' and
   * '{@link #slidesPerGroup}: 1'. When enabled, it will skip all slides in the view on
   * {@link Swiper#slideNext()} & {@link Swiper#slidePrev()} method calls, on navigation button
   * clicks and in autoplay.
   */
  @Default
  private boolean slidesPerGroupAuto = false;
  /**
   * If 'slidesPerGroupSkip == 0' (default), no slides are excluded from grouping and the resulting
   * behaviour is the same as without this change.
   * <br> <br>
   * If 'slidesPerGroupSkip > 0' the first X slides are treated as single groups, whereas all
   * following slides are grouped  by the '{@link #slidesPerGroup}' value.
   */
  @Default
  private int slidesPerGroupSkip = 0;
  /**
   * Distance between slides in px.
   * <br> <br>
   * If you use the "margin" css property to the elements which go into {@link Swiper} in which you
   * pass "spaceBetween" into, navigation might not work properly.
   */
  @Default
  private int spaceBetween = 0;
  /**
   * Threshold value in px. If "touch distance" will be lower than this value then {@link Swiper}
   * will not move.
   */
  @Default
  private int threshold = 5;
  /**
   * Allowable angle (in degrees) to trigger touch move.
   */
  @Default
  private int touchAngle = 45;
  /**
   * Target element to listen touch events on. Can be {@link TouchEventsTarget#CONTAINER} (to listen
   * for touch events on {@link Swiper}) or {@link TouchEventsTarget#WRAPPER} (to listen for touch
   * events on {@link Swiper}'s wrapper).
   */
  @Default @NonNull
  private TouchEventsTarget touchEventsTarget = TouchEventsTarget.WRAPPER;
  /**
   * If set to 'true', then propagation of "touchmove" will be stopped.
   */
  @Default
  private boolean touchMoveStopPropagation = false;
  /**
   * Touch Ratio
   *
   * @see <a href="https://swiperjs.com/swiper-api#param-touchRatio">SwiperJS Documentation</a>
   */
  @Default
  private int touchRatio = 1;
  /**
   * Enable to release touch events on slider edge position (beginning, end) to allow further page
   * scrolling
   */
  @Default
  private boolean touchReleaseOnEdges = false;
  /**
   * Force to always prevent default for 'touchstart' ('pointerdown') event.
   */
  @Default
  private boolean touchStartForcePreventDefault = false;
  /**
   * If disabled, 'pointerdown' events won't be prevented.
   */
  @Default
  private boolean touchStartPreventDefault = true;
  /**
   * If enabled (by default) and navigation elements' parameters passed as a string (like
   * ".pagination") then {@link Swiper} will look for such elements through child elements first.
   * Applies for pagination, prev/next buttons and scrollbar elements.
   */
  @Default
  private boolean uniqueNavElements = true;
  /**
   * {@link Swiper} will recalculate {@link Slide slides} position on window resize
   * (orientationchange)
   */
  @Default
  private boolean updateOnWindowResize = true;
  /**
   * Required for active slide detection when rendered on server-side and enabled history.
   */
  @Default
  private String url = null;
  /**
   * UserAgent String. Required for browser/device detection when rendered on server-side. NULL to
   * disable.
   */
  @Default
  private String userAgent = null;
  /**
   * Enable this option and {@link Swiper} will be operated as usual except it will not move, real
   * translate values on wrapper will not be set. Useful when you may need to create custom slide
   * transitions.
   */
  @Default
  private boolean virtualTranslate = false;
  /**
   * When enabled {@link Swiper} will be disabled and hide navigation buttons in case there are not
   * enough slides for sliding.
   */
  @Default
  private boolean watchOverflow = true;
  /**
   * Enable this feature to calculate each {@link Slide slides} progress and visibility
   * ({@link Slide slides} in viewport will have additional visible class)
   */
  @Default
  private boolean watchSlidesProgress = false;
  /**
   * {@link Swiper} width (in px). Parameter allows to force Swiper width. Useful only if you
   * initialize Swiper when it is hidden and in SSR and Test Environments for correct Swiper
   * initialization.
   * <br> <br>
   * Setting this parameter will make Swiper not responsive
   */
  @Default
  private Integer width = null;
  /**
   * CSS class name of {@link Slide slides'} wrapper.
   * <br> <br>
   * By changing this parameter you will also need to change {@link Swiper Swiper's} CSS to reflect
   * changed classes
   */
  @Default @NonNull
  private String wrapperClass = "swiper-wrapper";
  /**
   * Enables zooming functionality.
   */
  @Default
  private boolean zoom = false;
}
