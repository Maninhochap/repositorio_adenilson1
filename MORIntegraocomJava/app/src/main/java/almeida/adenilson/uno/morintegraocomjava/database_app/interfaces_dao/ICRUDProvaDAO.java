package almeida.adenilson.uno.morintegraocomjava.database_app.interfaces_dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

import almeida.adenilson.uno.morintegraocomjava.database_app.tabelas.Prova;

@Dao
public interface ICRUDProvaDAO {

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertProva(Prova provaTable);

    @Query("SELECT * FROM tbl_prova where id = :id")
    Prova getEspecificProvabyID(int id);

    @Query("SELECT * FROM tbl_prova ORDER BY id DESC")
    List<Prova> getAllProva();

    @Transaction
    @Update(entity = Prova.class, onConflict = OnConflictStrategy.REPLACE)
    void updateProva(Prova provaTable);

    @Transaction
    @Delete(entity = Prova.class)
    void deleteProva(Prova provaTable);

    @Transaction
    @Query("DELETE FROM tbl_prova WHERE id = :id")
    void deleteProvaByID(int id);

    @Query("DELETE FROM tbl_prova WHERE id > 0")
    void deleteAllprova();
}
