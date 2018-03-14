package cn.com.woong.readhub.domain;

import java.util.Map;

import cn.com.woong.readhub.resp.BaseResponse;
import io.reactivex.Observable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;
import retrofit2.http.Query;

/**
 * @author woong
 * ApiService 中方法命名和接口名称一致 例:api/login=apiLogin
 */

public interface ApiService {

    /**
     * 热门话题
     *
     * @param lastCursor
     * @param pageSize
     * @return
     */
    @GET("topic")
    Observable<BaseResponse> apiTopic(
            @Query("lastCursor") String lastCursor,
            @Query("pageSize") int pageSize
    );


    /**
     * 科技动态
     *
     * @param lastCursor
     * @param pageSize
     * @return
     */
    @GET("news")
    Observable<BaseResponse> apiNews(
            @Query("lastCursor") String lastCursor,
            @Query("pageSize") int pageSize
    );


    /**
     * 开发者资讯
     *
     * @param lastCursor
     * @param pageSize
     * @return
     */
    @GET("technews")
    Observable<BaseResponse> apiTechNews(
            @Query("lastCursor") String lastCursor,
            @Query("pageSize") int pageSize
    );
}