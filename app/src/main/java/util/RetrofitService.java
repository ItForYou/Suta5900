package util;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by 투덜이2 on 2017-02-14.
 */
// GET 방식 POST 방식 변수 세팅등등 설정
public interface RetrofitService {
    @GET("json/query.php")
    Call<RetrofitRepo> getIndex(
            @Query("name") String name
    );

    @FormUrlEncoded
    @POST("push_set.php")
    Call<RetrofitRepo> getItem(
            @FieldMap Map<String, String> option
    );

    @FormUrlEncoded
    @POST("mobile/push_setting.php")
    Call<RetrofitRepo> getPost(
            @Field("name") String name
    );
/*
    @FormUrlEncoded
    @POST("json/query.php?method=login")
    Call<LoginRepo> getLogin(
            @FieldMap Map<String, String> option
    );
    @FormUrlEncoded
    @POST("json/query.php?method=logout")
    Call<LogoutRepo> getLogout(
            @FieldMap Map<String, String> option
    );
    @FormUrlEncoded
    @POST("json/query.php?method=beaon")
    Call<BeaconRepo> getBeacon(
            @FieldMap Map<String, String> option
    );
    @FormUrlEncoded
    @POST("json/query.php?method=beaonupdate")
    Call<BeaconUpdateRepo> getUpdateBeacon(
            @FieldMap Map<String, String> option
    );*/
}
