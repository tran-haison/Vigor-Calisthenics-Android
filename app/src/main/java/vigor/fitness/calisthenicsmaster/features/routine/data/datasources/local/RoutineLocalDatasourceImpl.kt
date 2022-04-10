package vigor.fitness.calisthenicsmaster.features.routine.data.datasources.local

import vigor.fitness.calisthenicsmaster.features.routine.data.datasources.RoutineLocalDatasource
import vigor.fitness.calisthenicsmaster.features.routine.data.datasources.local.daos.RoutineDao
import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Plan
import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Progression
import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Routine

class RoutineLocalDatasourceImpl(
    private val _routineDao: RoutineDao
) : RoutineLocalDatasource {

    // Routine
    override suspend fun insertRoutineList(list: List<Routine>) {
        return _routineDao.insertRoutineList(list)
    }

    // Progression
    override suspend fun insertProgressionList(list: List<Progression>) {
        return _routineDao.insertProgressionList(list)
    }

    // Plan
    override suspend fun insertPlanList(list: List<Plan>) {
        return _routineDao.insertPlanList(list)
    }
}