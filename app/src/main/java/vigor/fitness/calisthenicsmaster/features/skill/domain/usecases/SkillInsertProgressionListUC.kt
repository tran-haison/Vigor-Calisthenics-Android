package vigor.fitness.calisthenicsmaster.features.skill.domain.usecases

import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Progression
import vigor.fitness.calisthenicsmaster.features.skill.domain.repositories.SkillRepository

class SkillInsertProgressionListUC(
    private val _skillRepository: SkillRepository
) {

    suspend operator fun invoke(list: List<Progression>) {
        return _skillRepository.insertProgression(list)
    }
}