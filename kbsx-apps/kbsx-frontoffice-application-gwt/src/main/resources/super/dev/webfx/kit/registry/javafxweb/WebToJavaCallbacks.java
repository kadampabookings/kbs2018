// File managed by WebFX (DO NOT EDIT MANUALLY)
package dev.webfx.kit.registry.javafxweb;

import jsinterop.annotations.JsFunction;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

public class WebToJavaCallbacks {

    public static void bindCallbackMethods(Object javaInstance) {
        JsPropertyMap<Object> pm = Js.asPropertyMap(javaInstance);
        if (javaInstance instanceof dev.webfx.extras.player.video.web.SeamlessCapableWebVideoPlayer) {
            dev.webfx.extras.player.video.web.SeamlessCapableWebVideoPlayer castedInstance = (dev.webfx.extras.player.video.web.SeamlessCapableWebVideoPlayer) javaInstance;
            pm.set("onReady", (JsVoidFn0Arg) castedInstance::onReady);
            pm.set("onPlay", (JsVoidFn0Arg) castedInstance::onPlay);
            pm.set("onPause", (JsVoidFn0Arg) castedInstance::onPause);
            pm.set("onEnd", (JsVoidFn0Arg) castedInstance::onEnd);
        } else if (javaInstance instanceof dev.webfx.extras.webview.pane.WebViewPane) {
            dev.webfx.extras.webview.pane.WebViewPane castedInstance = (dev.webfx.extras.webview.pane.WebViewPane) javaInstance;
            pm.set("consoleLog", (JsVoidFn1Arg<java.lang.String>) castedInstance::consoleLog);
            pm.set("consoleWarn", (JsVoidFn1Arg<java.lang.String>) castedInstance::consoleWarn);
            pm.set("consoleError", (JsVoidFn1Arg<java.lang.String>) castedInstance::consoleError);
        }
    }


    @JsFunction
    public interface JsVoidFn0Arg {
        void apply();
    }

    @JsFunction
    public interface JsVoidFn1Arg<T1> {
        void apply(T1 arg1);
    }

}