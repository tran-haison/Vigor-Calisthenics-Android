package vigor.fitness.calisthenicsmaster.core.utils.converter

import android.content.Context
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import org.json.JSONObject
import vigor.fitness.calisthenicsmaster.core.utils.log.log
import vigor.fitness.calisthenicsmaster.core.utils.log.logError
import vigor.fitness.calisthenicsmaster.features.exercise.data.models.ExerciseModel
import vigor.fitness.calisthenicsmaster.features.routine.data.models.RoutineModel
import vigor.fitness.calisthenicsmaster.features.skill.data.models.SkillModel
import java.lang.reflect.Modifier

class JsonConverter(
    private val _context: Context,
) {

    companion object {
        private const val EXERCISES_JSON_FILE = "data/exercises.json"
        private const val ROUTINES_JSON_FILE = "data/routines.json"
        private const val SKILLS_JSON_FILE = "data/skills.json"

        private const val EXERCISES_ARRAY_NAME = "exercises"
        private const val ROUTINES_ARRAY_NAME = "routines"
        private const val SKILLS_ARRAY_NAME = "skills"
    }

    fun getExercisesList(): List<ExerciseModel> {
        val jsonFileString = readJsonAssets(EXERCISES_JSON_FILE)
        val jsonRoot = JSONObject(jsonFileString)
        val jsonArray = jsonRoot.getJSONArray(EXERCISES_ARRAY_NAME)
        val gson = GsonBuilder().excludeFieldsWithModifiers(Modifier.TRANSIENT).create()
        val listExercisesType = object : TypeToken<List<ExerciseModel>>() {}.type
        return gson.fromJson(jsonArray.toString(), listExercisesType)
    }

    fun getRoutinesList(): List<RoutineModel> {
        val jsonFileString = readJsonAssets(ROUTINES_JSON_FILE)
        val jsonRoot = JSONObject(jsonFileString)
        val jsonArray = jsonRoot.getJSONArray(ROUTINES_ARRAY_NAME)
        val gson = GsonBuilder().excludeFieldsWithModifiers(Modifier.TRANSIENT).create()
        val listRoutinesType = object : TypeToken<List<RoutineModel>>() {}.type
        return gson.fromJson(jsonArray.toString(), listRoutinesType)
    }

    fun getSkillsList(): List<SkillModel> {
        val jsonFileString = readJsonAssets(SKILLS_JSON_FILE)
        val jsonRoot = JSONObject(jsonFileString)
        val jsonArray = jsonRoot.getJSONArray(SKILLS_ARRAY_NAME)
        val gson = GsonBuilder().excludeFieldsWithModifiers(Modifier.TRANSIENT).create()
        val listSkillsType = object : TypeToken<List<SkillModel>>() {}.type
        return gson.fromJson(jsonArray.toString(), listSkillsType)
    }

    private fun readJsonAssets(filePath: String): String {
        val jsonString: String
        try {
            val inputStream = _context.assets.open(filePath)
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            jsonString = String(buffer)
            inputStream.close()
        } catch (e: Exception) {
            logError { e.message.toString() }
            return ""
        }
        log { jsonString }
        return jsonString
    }

}