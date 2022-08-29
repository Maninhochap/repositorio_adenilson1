package almeida.adenilson.uno.morintegraocomjava.database_app.interfaces_dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

import almeida.adenilson.uno.morintegraocomjava.database_app.tabelas.Aluno;
import almeida.adenilson.uno.morintegraocomjava.database_app.tabelas.Resposta;

@Dao
public interface ICRUDRespostaDAO {

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)//PARA INSERIR RESPOSTA NA TABELA.
    void insertResposta(Resposta respostaTable);

    @Query("SELECT * FROM tbl_resposta where id = :id")//PARA SELECIONAR UMA RESPOSTA PELO ID.
    Aluno getEspecificAlunobyID(int id);

    @Query("SELECT * FROM tbl_resposta ORDER BY id DESC")//seleciona todas as respostas pelo id de forma descrecente
    List<Resposta> getAllResposta();

    @Transaction
    @Update(entity = Resposta.class, onConflict = OnConflictStrategy.REPLACE)
    void updateResposta(Resposta respostaTable);

    @Transaction
    @Delete(entity = Resposta.class)//deleta todas as respostas.
    void deleteResposta(Resposta respostaTable);

    @Transaction
    @Query("DELETE FROM tbl_resposta WHERE id = :id")//deleta as respostas pelo seu id
    void deleteRespostaByID(int id);

    @Query("DELETE FROM tbl_resposta WHERE id > 0")//deleta as respostas com id maior que 0.
    void deleteAllResposta();
}
