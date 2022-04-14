package vigor.fitness.calisthenicsmaster.core.utils.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import vigor.fitness.calisthenicsmaster.core.domain.entities.Stretching
import vigor.fitness.calisthenicsmaster.core.domain.entities.WarmUp

abstract class Converter<T> {

    @TypeConverter
    fun objectToString(param: T): String {
        val gson = Gson()
        return gson.toJson(param)
    }

    @TypeConverter
    fun stringToObject(json: String): T {
        val gson = Gson()
        val type = object : TypeToken<T>() {}.type
        return gson.fromJson(json, type)
    }
}

class ListStringConverter: Converter<List<String>>()
class ListIntConverter: Converter<List<Int>>()

class ListWarmUpConverter: Converter<List<WarmUp>>()
class ListStretchingConverter: Converter<List<Stretching>>()

