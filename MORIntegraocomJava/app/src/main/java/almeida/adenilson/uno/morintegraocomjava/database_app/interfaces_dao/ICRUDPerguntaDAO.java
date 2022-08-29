package almeida.adenilson.uno.morintegraocomjava.database_app.interfaces_dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

import almeida.adenilson.uno.morintegraocomjava.database_app.tabelas.Pergunta;

@Dao
public interface ICRUDPerguntaDAO {

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertPergunta(Pergunta perguntaTable);

    @Query("SELECT * FROM tbl_pergunta where id = :id")
    Pergunta getEspecificPerguntabyID(int id);

    @Query("SELECT * FROM tbl_pergunta ORDER BY id DESC")
    List<Pergunta> getAllPergunta();

    @Transaction
    @Update(entity = Pergunta.class, onConflict = OnConflictStrategy.REPLACE)
    void updatePergunta(Pergunta perguntaTable);

    @Transaction
    @Delete(entity = Pergunta.class)
    void deletePergunta(Pergunta perguntaTable);

    @Transaction
    @Query("DELETE FROM tbl_pergunta WHERE id = :id")
    void deletePerguntaByID(int id);

    @Query("DELETE FROM tbl_pergunta WHERE id > 0")
    void deleteAllPergunta();
}
