package vigor.fitness.calisthenicsmaster.features.routine.data.datasources

import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Plan
import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Progression
import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Routine

interface RoutineLocalDatasource {

    // Routine
    suspend fun insertRoutineList(list: List<Routine>)

    // Progression
    suspend fun insertProgressionList(list: List<Progression>)

    // Plan
    suspend fun insertPlanList(list: List<Plan>)
}