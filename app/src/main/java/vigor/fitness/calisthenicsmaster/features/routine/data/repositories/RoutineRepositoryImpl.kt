package vigor.fitness.calisthenicsmaster.features.routine.data.repositories

import vigor.fitness.calisthenicsmaster.features.routine.data.datasources.RoutineLocalDatasource
import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Plan
import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Progression
import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Routine
import vigor.fitness.calisthenicsmaster.features.routine.domain.repositories.RoutineRepository

class RoutineRepositoryImpl (
    private val _routineLocalDatasource: RoutineLocalDatasource
) : RoutineRepository {

    // Routine
    override suspend fun insertRoutineList(list: List<Routine>) {
        return _routineLocalDatasource.insertRoutineList(list)
    }

    // Progression
    override suspend fun insertProgressionList(list: List<Progression>) {
        return _routineLocalDatasource.insertProgressionList(list)
    }

    // Plan
    override suspend fun insertPlanList(list: List<Plan>) {
        return _routineLocalDatasource.insertPlanList(list)
    }
}