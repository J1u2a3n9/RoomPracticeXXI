package ucb.edu.bo.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface IBookDao {

    @Query("SELECT * FROM book_table")
    fun getList(): List<Book>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(book:Book)

    @Query("DELETE FROM book_table")
    fun deleteAll()
}
