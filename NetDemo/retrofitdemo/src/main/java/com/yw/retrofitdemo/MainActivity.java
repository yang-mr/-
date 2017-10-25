package com.yw.retrofitdemo;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;

import com.yw.retrofitdemo.domain.User;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor()//log，统一的header等
        {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException
            {
                return null;
            }
        }).build();

        String base_url = "";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .callFactory(client)  //配置okhttpClient
                .build();

        IUser iUser = retrofit.create(IUser.class);
        Call<List<User>> call = iUser.getUsers();

        call.enqueue(new Callback<List<User>>() {  //异步
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {

            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {

            }
        });

        try {
            call.execute();   //同步
        } catch (IOException e) {
            e.printStackTrace();
        }

//        //测试单文件上传
//        File file = new File(Environment.getExternalStorageDirectory(), "test.png");
//        RequestBody requestBody = RequestBody.create(MediaType.parse("image/png"), file);
//        MultipartBody.Part part = MultipartBody.Part.createFormData("test", "test.png", requestBody);
//        iUser.uploadFile(part, RequestBody.create(null, "jack"));

        //测试多文件上传
        File file = new File(Environment.getExternalStorageDirectory(), "test.png");
        RequestBody requestBody = RequestBody.create(MediaType.parse("image/png"), file);
        Map<String, RequestBody> params = new HashMap();
        params.put("test\\\"; filename=\\\"icon.png", requestBody);
        params.put("other", RequestBody.create(null, "666"));
        iUser.uploadFiles(params, RequestBody.create(null, "jack"));

        //测试下载文件
        Call<ResponseBody> downloadFile = iUser.download();
        downloadFile.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                response.body().source();
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });

    }
}
