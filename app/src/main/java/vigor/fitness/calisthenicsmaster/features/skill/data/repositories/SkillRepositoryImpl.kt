package vigor.fitness.calisthenicsmaster.features.skill.data.repositories

import vigor.fitness.calisthenicsmaster.features.skill.data.datasources.SkillLocalDatasource
import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Plan
import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Progression
import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Skill
import vigor.fitness.calisthenicsmaster.features.skill.domain.repositories.SkillRepository

class SkillRepositoryImpl(
    private val _skillLocalDatasource: SkillLocalDatasource
) : SkillRepository {

    // Skill
    override suspend fun insertSkillList(list: List<Skill>) {
        return _skillLocalDatasource.insertSkillList(list)
    }

    // Progression
    override suspend fun insertProgression(list: List<Progression>) {
        return _skillLocalDatasource.insertProgressionList(list)
    }

    // Plan
    override suspend fun insertPlanList(list: List<Plan>) {
        return _skillLocalDatasource.insertPlanList(list)
    }
}