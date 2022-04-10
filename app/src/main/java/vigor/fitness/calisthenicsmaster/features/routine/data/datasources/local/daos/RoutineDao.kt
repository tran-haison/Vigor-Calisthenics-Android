package vigor.fitness.calisthenicsmaster.features.routine.data.datasources.local.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Plan
import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Progression
import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Routine

@Dao
interface RoutineDao {

    // Routine
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRoutineList(list: List<Routine>)

    // Progression
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProgressionList(list: List<Progression>)

    // Plan
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPlanList(list: List<Plan>)
}