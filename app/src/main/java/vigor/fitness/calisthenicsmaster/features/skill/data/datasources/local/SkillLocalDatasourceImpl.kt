package vigor.fitness.calisthenicsmaster.features.skill.data.datasources.local

import org.koin.core.module._singleInstanceFactory
import vigor.fitness.calisthenicsmaster.features.skill.data.datasources.SkillLocalDatasource
import vigor.fitness.calisthenicsmaster.features.skill.data.datasources.local.daos.SkillDao
import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Plan
import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Progression
import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Skill

class SkillLocalDatasourceImpl(
    private val _skillDao: SkillDao
) : SkillLocalDatasource {

    // Skill
    override suspend fun insertSkillList(list: List<Skill>) {
        return _skillDao.insertSkillList(list)
    }

    // Progression
    override suspend fun insertProgressionList(list: List<Progression>) {
        return _skillDao.insertProgressionList(list)
    }

    // Plan
    override suspend fun insertPlanList(list: List<Plan>) {
        return _skillDao.insertPlanList(list)
    }

}