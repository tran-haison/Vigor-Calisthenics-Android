package vigor.fitness.calisthenicsmaster.features.skill.data.datasources

import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Plan
import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Progression
import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Skill

interface SkillLocalDatasource {

    // Skill
    suspend fun insertSkillList(list: List<Skill>)

    // Progression
    suspend fun insertProgressionList(list: List<Progression>)

    // Plan
    suspend fun insertPlanList(list: List<Plan>)
}