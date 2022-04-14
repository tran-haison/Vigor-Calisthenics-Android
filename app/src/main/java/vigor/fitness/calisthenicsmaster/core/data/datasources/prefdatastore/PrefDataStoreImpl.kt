package vigor.fitness.calisthenicsmaster.core.data.datasources.prefdatastore

import android.content.Context
import androidx.datastore.dataStore
import androidx.datastore.preferences.preferencesDataStore

private const val PREF_DATASTORE_NAME = "pref_datastore"

class PrefDataStoreImpl : PrefDataStore {

    private val Context.dataStore by preferencesDataStore(PREF_DATASTORE_NAME)

    override suspend fun saveValue() {
        TODO("Not yet implemented")
    }

    override suspend fun getValue() {
        TODO("Not yet implemented")
    }
}

private object PrefKeys {
    // TODO: add key
}