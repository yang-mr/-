#include <jni.h>
#include <android/log.h>
#include <stdio.h>
#include <stdlib.h>


jstring getKey(JNIEnv *env,jclass clazz);




JNIEXPORT jint JNI_OnLoad(JavaVM* vm, void* reserved){

    //打印日志，说明已经进来了
    __android_log_print(ANDROID_LOG_DEBUG,"JNITag","enter jni_onload");

    JNIEnv* env = NULL;
    jint result = -1;

    // 判断是否正确
    if((*vm)->GetEnv(vm,(void**)&env,JNI_VERSION_1_6)!= JNI_OK){
        return result;
    }

    //注册四个方法，注意签名
    const JNINativeMethod method[]={
            {"getKey","()Ljava/lang/String;",(void*)getKey}
    };

    //找到对应的JNITools类
    jclass jClassName=(*env)->FindClass(env,"kotlin/yw/ywsdk/jni/JNIKeyTools");

    //开始注册
    jint ret = (*env)->RegisterNatives(env,jClassName,method, 1);

     //如果注册失败，打印日志
    if (ret != JNI_OK) {
        __android_log_print(ANDROID_LOG_DEBUG, "JNITag", "jni_register Error");
        return -1;
    }

    return JNI_VERSION_1_6;
}


jstring getKey(JNIEnv *env,jclass clazz){
     return (*env)->NewStringUTF(env, "我来自 native");
}


