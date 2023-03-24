package id.ac.unpas.PenyewaanVilla.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import id.ac.unpas.PenyewaanVilla.model.SetoranVilla

@Database(entities = [SetoranVilla::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun setoranVillaDao(): SetoranVillaDao
}
