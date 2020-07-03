package com.indra.covid19.api;

import com.indra.covid19.model.ModelDunia;
import com.indra.covid19.model.ModelIndonesia;
import com.indra.covid19.model.ModelProvinsi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiCorona {

    //Endpointt Ringkasan Dunia
    @GET(Api.END_POINT_SUMMARY_WORLD)
    Call<ModelDunia> getSummaryWorld();

    //Endpoint Ringkasan Indonesia
    @GET(Api.ENDPOINT_SUMMARY_INDONESIA)
    Call<List<ModelIndonesia>> getSummaryIdn();

    //Endpoint Provinsi Indonesia
    @GET(Api.ENDPOINT_INDONESIA_PROVINSI)
    Call<List<ModelProvinsi>> getProvince();
}

