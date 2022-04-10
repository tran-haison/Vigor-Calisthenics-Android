package vigor.fitness.calisthenicsmaster.features.routine.data.datasources.local

import androidx.room.Database
import androidx.room.RoomDatabase
import vigor.fitness.calisthenicsmaster.features.routine.data.datasources.local.daos.RoutineDao
import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Plan
import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Progression
import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Routine

@Database(
    entities = [
        Routine::class,
        Progression::class,
        Plan::class],
    version = 1
)
abstract class RoutineDatabase : RoomDatabase() {

    abstract val routineDao: RoutineDao

    companion object {
        const val ROUTINE_DATABASE_NAME = "routines.db"
    }
}