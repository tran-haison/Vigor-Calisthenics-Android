package vigor.fitness.calisthenicsmaster.features.exercise.data.datasources.local.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import vigor.fitness.calisthenicsmaster.features.exercise.domain.entities.Exercise

@Dao
interface ExerciseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExercise(exercise: Exercise)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExerciseList(exerciseList: List<Exercise>)

    @Query("SELECT * FROM Exercise WHERE id = :id")
    suspend fun getExerciseById(id: Int): Exercise?

    @Query("SELECT * FROM Exercise")
    fun getAllExercises(): Flow<List<Exercise>>


}