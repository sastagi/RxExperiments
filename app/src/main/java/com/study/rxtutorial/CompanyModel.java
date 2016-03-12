package com.study.rxtutorial;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by sastagi on 3/5/16.
 */
public interface CompanyModel {
        @GET("/{user}")      //here is the other url part.best way is to start using /
        //public void getFeed(@Path("user") String user, Callback<List<Company>> response);     //string user is for passing values from edittext for eg: user=basil2style,google
        //response is the response from the server which is now in the POJO
        Observable<List<Company>> getUser(@Path("user") String login);
}
