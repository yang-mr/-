package kotlin.yw.ywsdk.jni;

/**
 * Created on 2019/9/1515:49.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */
public class JNIKeyTools {
    static {
        System.loadLibrary("ywsdktools");
    }
    public static native String getKey();
}
