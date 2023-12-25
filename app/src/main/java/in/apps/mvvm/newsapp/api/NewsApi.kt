package `in`.apps.mvvm.newsapp.api

import `in`.apps.mvvm.newsapp.util.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("v2/top-headlines")
    suspend fun getHeadlines(
        @Query("country")
        countryCode:String = "in",
        @Query("page")
        pageNumber:Int = 1,
        @Query("apiKey")
        apiKey :String = Constants.apiKey
    ):Response<NewsResponce>



    @GET("v2/everything")
    suspend fun searchNews(
        @Query("q")
        countryCode:String ,
        @Query("page")
        pageNumber:Int = 1,
        @Query("apiKey")
        apiKey :String = Constants.apiKey
    ):Response<NewsResponce>
}