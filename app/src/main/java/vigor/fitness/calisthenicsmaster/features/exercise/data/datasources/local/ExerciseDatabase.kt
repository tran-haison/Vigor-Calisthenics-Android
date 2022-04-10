package vigor.fitness.calisthenicsmaster.features.exercise.data.datasources.local

import androidx.room.Database
import androidx.room.RoomDatabase
import vigor.fitness.calisthenicsmaster.features.exercise.data.datasources.local.daos.ExerciseDao
import vigor.fitness.calisthenicsmaster.features.exercise.domain.entities.Exercise

@Database(
    entities = [Exercise::class],
    version = 1
)
abstract class ExerciseDatabase : RoomDatabase() {

    abstract val exerciseDao: ExerciseDao

    companion object {
        const val EXERCISE_DATABASE_NAME = "exercises.db"
    }
}