package almeida.adenilson.uno.morintegraocomjava.database_app.interfaces_dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

import almeida.adenilson.uno.morintegraocomjava.database_app.tabelas.Aluno;
import almeida.adenilson.uno.morintegraocomjava.database_app.tabelas.AlunoProva;

public interface ICRUDAlunoProvaDAO {

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAlunoProva(AlunoProva alunoProvaTable);

    @Query("SELECT * FROM tbl_aluno_prova WHERE alunoId = :idAluno AND provaId")
    AlunoProva getEspecificAlunobyID(int idAluno, int idProva);

    @Query("SELECT * FROM tbl_aluno_prova ORDER BY alunoId DESC")
    List<AlunoProva> getAllAlunoProva();

    @Transaction
    @Update(entity = AlunoProva.class, onConflict = OnConflictStrategy.REPLACE)
    void updateAlunoProva(AlunoProva alunoProvaTable);

    @Transaction
    @Delete(entity = AlunoProva.class)
    void deleteAlunoProva(AlunoProva alunoProvaTable);

    @Transaction
    @Query("DELETE FROM tbl_aluno_prova WHERE alunoId = :id")
    void deleteAlunoProvaByID(int id);

    @Query("DELETE FROM tbl_aluno_prova WHERE alunoId > 0")
    void deleteAllAlunoProva();
}
