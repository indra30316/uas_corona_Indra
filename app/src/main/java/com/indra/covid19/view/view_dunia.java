package com.indra.covid19.view;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.indra.covid19.api.ApiCorona;
import com.indra.covid19.model.ModelDunia;
import com.indra.covid19.service.RetrofitServiceApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class view_dunia extends ViewModel {
    private MutableLiveData<ModelDunia> mutableLiveData = new MutableLiveData<>();

    public void setSummaryWorldData() {
        Retrofit retrofit = RetrofitServiceApi.getRetrofitService();
        ApiCorona apiCorona = retrofit.create(ApiCorona.class);
        Call<ModelDunia> call = apiCorona.getSummaryWorld();
        call.enqueue(new Callback<ModelDunia>() {
            @Override
            public void onResponse(Call<ModelDunia> call, Response<ModelDunia> response) {
                mutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<ModelDunia> call, Throwable t) {

            }
        });

    }

    public LiveData<ModelDunia> getSummaryWorldData() {
        return mutableLiveData;
    }
}
