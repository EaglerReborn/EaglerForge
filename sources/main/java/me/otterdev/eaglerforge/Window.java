package me.otterdev.eaglerforge;

import org.teavm.jso.JSBody;

public class Window {
  @JSBody(params = { "thing" }, script = "document.title = thing")
  public static native void set(String thing);

  @JSBody(params = { }, script = "window.open('','_self').close()")
  public static native void quit();
  // note that this only works in offline downloads
}
