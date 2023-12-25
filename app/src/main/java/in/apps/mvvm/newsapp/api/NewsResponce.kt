package `in`.apps.mvvm.newsapp.api

import `in`.apps.mvvm.newsapp.api.Article

data class NewsResponce(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)