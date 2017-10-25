package com.yw.retrofitdemo;

import com.yw.retrofitdemo.domain.User;

import java.util.List;
import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;

/**
 * Created by yw on 17/10/24.
 * author jackyang
 * com.yw.retrofitdemo
 */
public interface IUser {
    @GET("users")
    Call<List<User>> getUsers();

    @GET("user")
    Call<List<User>> getUser(@Path("name")String name);   //动态的URL路径设置

    @POST("add")
    Call<List<User>> addUser(@Body User user);   //动态的URL路径设置

    @POST("login")
    @FormUrlEncoded //表单的方式传递键值对@FormUrlEncoded
    Call<User> login(@Field("name") String name);

    @POST("upload")
    @Multipart     //单文件上传@Multipart
    Call<User> uploadFile(@Part MultipartBody.Part file, @Part("name")RequestBody name);

    @POST("uploads")
    @Multipart     //多文件上传@PartMap
    Call<User> uploadFiles(@PartMap Map<String, RequestBody> params, @Part("name")RequestBody name);

    //下载文件
    @GET("download")
    Call<ResponseBody> download();

}
