package vigor.fitness.calisthenicsmaster.core.utils.converter

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.json.JSONObject
import vigor.fitness.calisthenicsmaster.features.exercise.domain.models.Exercise
import vigor.fitness.calisthenicsmaster.features.routine.domain.models.Routine
import vigor.fitness.calisthenicsmaster.features.skill.domain.models.Skill

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

    fun getExercisesList(): List<Exercise> {
        val jsonFileString = readJsonAssets(EXERCISES_JSON_FILE)
        val jsonRoot = JSONObject(jsonFileString)
        val jsonArray = jsonRoot.getJSONArray(EXERCISES_ARRAY_NAME)

        val gson = Gson()
        val listExercisesType = object : TypeToken<List<Exercise>>() {}.type
        return gson.fromJson(jsonArray.toString(), listExercisesType)
    }

    fun getRoutinesList(): List<Routine> {
        val jsonFileString = readJsonAssets(ROUTINES_JSON_FILE)
        val jsonRoot = JSONObject(jsonFileString)
        val jsonArray = jsonRoot.getJSONArray(ROUTINES_ARRAY_NAME)

        val gson = Gson()
        val listRoutinesType = object : TypeToken<List<Routine>>() {}.type
        return gson.fromJson(jsonArray.toString(), listRoutinesType)
    }

    fun getSkillsList(): List<Skill> {
        val jsonFileString = readJsonAssets(SKILLS_JSON_FILE)
        val jsonRoot = JSONObject(jsonFileString)
        val jsonArray = jsonRoot.getJSONArray(SKILLS_ARRAY_NAME)

        val gson = Gson()
        val listSkillsType = object : TypeToken<List<Skill>>() {}.type
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
            e.printStackTrace()
            return ""
        }
        return jsonString
    }

}