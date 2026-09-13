package za.co.laduma.toolkit

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class TaskEntity(
    @PrimaryKey val id: String,
    val title: String,
    val description: String,
    val status: String,
    val dueDate: String?,
    val createdAt: String
)

@Entity(tableName = "notes")
data class NoteEntity(
    @PrimaryKey val id: String,
    val title: String,
    val content: String,
    val createdAt: String
)

@Entity(tableName = "contacts")
data class ContactEntity(
    @PrimaryKey val id: String,
    val name: String,
    val jobTitle: String,
    val store: String,
    val phone: String,
    val email: String,
    val notes: String
)

@Entity(tableName = "photos")
data class PhotoEntity(
    @PrimaryKey val id: String,
    val filePath: String,
    val caption: String,
    val dateTaken: String,
    val addedAt: String
)

@Entity(tableName = "contract")
data class ContractEntity(
    @PrimaryKey val id: Int = 1,
    val details: String,
    val updatedAt: String?
)

@Database(
    entities = [TaskEntity::class, NoteEntity::class, ContactEntity::class,
        PhotoEntity::class, ContractEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase()
