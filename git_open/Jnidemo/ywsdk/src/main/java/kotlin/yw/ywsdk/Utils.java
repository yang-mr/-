package kotlin.yw.ywsdk;

import kotlin.yw.ywsdk.jni.JNIKeyTools;

/**
 * Created on 2019/9/1515:09.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */
public class Utils {

    public static String key() {
        return JNIKeyTools.getKey();
    }
}
