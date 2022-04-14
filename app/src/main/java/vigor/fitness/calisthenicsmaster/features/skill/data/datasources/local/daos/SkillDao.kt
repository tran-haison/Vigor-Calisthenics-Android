package vigor.fitness.calisthenicsmaster.features.skill.data.datasources.local.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Plan
import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Progression
import vigor.fitness.calisthenicsmaster.features.skill.domain.entities.Skill

@Dao
interface SkillDao {

    // Skill
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSkillList(list: List<Skill>)

    // Progression
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProgressionList(list: List<Progression>)

    // Plan
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPlanList(list: List<Plan>)

}