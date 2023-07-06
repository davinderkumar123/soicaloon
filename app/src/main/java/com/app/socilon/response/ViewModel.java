package com.app.socilon.response;

import android.app.Activity;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.app.socilon.appModelClasses.RegisterRoot;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ViewModel {
//    ApiInterface apiInterface = RetrofitCaller.getRetrofit().create(ApiInterface.class);

    // Register View Model
//    private MutableLiveData<RegisterRoot> registerRootMutableLiveData;
//    public LiveData<RegisterRoot>registerRootLiveData(Activity activity, String email, String password,String referral_code){
//        registerRootMutableLiveData = new MutableLiveData<>();
//        apiInterface.register(email,password,referral_code).enqueue(new Callback<RegisterRoot>() {
//            @Override
//            public void onResponse(Call<RegisterRoot> call, Response<RegisterRoot> response) {
//                if (response.body()!=null){
//                    registerRootMutableLiveData.postValue(response.body());
//                }else {
//                    Toast.makeText(activity, ""+response.message(), Toast.LENGTH_SHORT).show();
//                }
//
//            }
//
//            @Override
//            public void onFailure(Call<RegisterRoot> call, Throwable t) {
//                Toast.makeText(activity, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
//
//            }
//        });
//return registerRootMutableLiveData;
//    }


}
