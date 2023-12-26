package `in`.apps.mvvm.newsapp.models

import `in`.apps.mvvm.newsapp.models.Article

data class NewsResponce(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)