package vigor.fitness.calisthenicsmaster.features.skill.domain.usecases

import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Plan
import vigor.fitness.calisthenicsmaster.features.skill.domain.repositories.SkillRepository

class SkillInsertPlanListUC(
    private val _skillRepository: SkillRepository
) {

    suspend operator fun invoke(list: List<Plan>) {
        return _skillRepository.insertPlanList(list)
    }
}