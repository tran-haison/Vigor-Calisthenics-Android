package vigor.fitness.calisthenicsmaster.features.routine.domain.usecases

import vigor.fitness.calisthenicsmaster.features.routine.domain.entities.Progression
import vigor.fitness.calisthenicsmaster.features.routine.domain.repositories.RoutineRepository

class RoutineInsertProgressionListUC(
    private val _routineRepository: RoutineRepository
) {

    suspend operator fun invoke(list: List<Progression>) {
        return _routineRepository.insertProgressionList(list)
    }
}