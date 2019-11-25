package com.lwq.mobileshop2.http.service;

import com.lwq.mobileshop2.http.entity.CategoryEntity;
import com.lwq.mobileshop2.http.entity.HttpResult;

import java.util.List;


import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface CategoryService {



    @GET("cat")
    Observable<HttpResult<List<CategoryEntity>>> getTopList();


    @GET("cat/parent/{parentId}")
    Observable<HttpResult<List<CategoryEntity>>> getSecondList(@Path("parentId") int parentId);

}
