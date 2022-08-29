package almeida.adenilson.uno.morintegraocomjava.database_app.dbcallbacks;
import java.util.List;

import almeida.adenilson.uno.morintegraocomjava.database_app.tabelas.Aluno;

public interface IAlunoDbCallback {
    void getAlunoFromDB(List<Aluno> tblAluno);
}
