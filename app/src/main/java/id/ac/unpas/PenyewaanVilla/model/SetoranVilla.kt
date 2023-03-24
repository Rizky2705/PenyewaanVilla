package id.ac.unpas.PenyewaanVilla.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.vo.Entity

@Entity
data class SetoranVilla(
    @PrimaryKey val id: String,
    val tanggal: String,
    val nama: String,
    val jumlah: String,
    val berapa_lama: String,

)
