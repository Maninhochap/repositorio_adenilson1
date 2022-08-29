package almeida.adenilson.uno.morintegraocomjava.database_app.interfaces_dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.net.PortUnreachableException;
import java.util.List;

import almeida.adenilson.uno.morintegraocomjava.database_app.tabelas.Aluno;

@Dao
public interface ICRUDAlunoDAO {

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAluno(Aluno alunoTable);

    @Query("SELECT * FROM tbl_aluno where id = :id")//ID É UMA CHAVE PRIMARIA DA TABELA.
    Aluno getEspecificAlunobyID(int id);

    @Query("SELECT * FROM tbl_aluno ORDER BY id DESC")
    List<Aluno> getAllAlunos();

    @Transaction
    @Update(entity = Aluno.class, onConflict = OnConflictStrategy.REPLACE)
    void updateAluno(Aluno alunoTable);

    @Transaction
    @Delete(entity = Aluno.class)
    void deleteAluno(Aluno alunoTable);

    @Transaction
    @Query("DELETE FROM tbl_aluno WHERE id = :id")
    void deleteAlunoByID(int id);

    @Query("DELETE FROM tbl_aluno WHERE id > 0")
    void deleteAllAlunos();
}
