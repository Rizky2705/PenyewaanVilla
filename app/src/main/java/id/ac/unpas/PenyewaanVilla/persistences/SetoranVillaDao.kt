package id.ac.unpas.PenyewaanVilla.persistences

import androidx.lifecycle.LiveData
import androidx.room.*
import id.ac.unpas.PenyewaanVilla.model.SetoranVilla

@Dao
interface SetoranVillaDao {
    @Query("SELECT * FROM SetoranVilla")
    fun loadAll(): LiveData<List<SetoranVilla>>

    @Query("SELECT * FROM SetoranVilla WHERE id = :id")
    fun find(id: String): SetoranVilla?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: SetoranVilla)

    @Delete
    fun delete(item: SetoranVilla)
}