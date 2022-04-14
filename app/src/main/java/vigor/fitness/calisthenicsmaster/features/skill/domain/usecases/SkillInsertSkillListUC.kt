package vigor.fitness.calisthenicsmaster.features.skill.domain.usecases

import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Skill
import vigor.fitness.calisthenicsmaster.features.skill.domain.repositories.SkillRepository

class SkillInsertSkillListUC(
    private val _skillRepository: SkillRepository
) {

    suspend operator fun invoke(list: List<Skill>) {
        return _skillRepository.insertSkillList(list)
    }
}