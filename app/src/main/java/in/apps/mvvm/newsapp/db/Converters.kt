package `in`.apps.mvvm.newsapp.db

import androidx.room.TypeConverter
import `in`.apps.mvvm.newsapp.models.Source


class Converters {

    @TypeConverter
    fun fromSource(source: Source) : String{
        return source.name
    }

    @TypeConverter
    fun toSource(name:String): Source {
        return Source(name,name)
    }
}