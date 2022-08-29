package almeida.adenilson.uno.morintegraocomjava.database_app.tabelas;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "tbl_aluno_prova",
        primaryKeys = {"alunoId", "provaId"},
        indices = {@Index(value = {"alunoId"}), @Index(value = {"provaId"})},
        foreignKeys = {@ForeignKey(entity = Aluno.class, parentColumns = "id",
        childColumns = "alunoId", onUpdate = CASCADE, onDelete = CASCADE),
        @ForeignKey(entity = Prova.class, parentColumns = "id",
        childColumns = "provaId", onUpdate = CASCADE, onDelete = CASCADE)})

public class AlunoProva {
    private int alunoId, provaId;

    public AlunoProva() {
    }

    //Construtor de cópia
    public AlunoProva(AlunoProva tblAlunoProva){
        this.alunoId = tblAlunoProva.getAlunoId();
        this.provaId = tblAlunoProva.getProvaId();
    }

    public int getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(int alunoId) {
        this.alunoId = alunoId;
    }

    public int getProvaId() {
        return provaId;
    }

    public void setProvaId(int provaId) {
        this.provaId = provaId;
    }
}
