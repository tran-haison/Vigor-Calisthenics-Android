package vigor.fitness.calisthenicsmaster.features.skill.domain.repositories

import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Plan
import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Progression
import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Skill

interface SkillRepository {

    // Skill
    suspend fun insertSkillList(list: List<Skill>)

    // Progression
    suspend fun insertProgression(list: List<Progression>)

    // Plan
    suspend fun insertPlanList(list: List<Plan>)
}