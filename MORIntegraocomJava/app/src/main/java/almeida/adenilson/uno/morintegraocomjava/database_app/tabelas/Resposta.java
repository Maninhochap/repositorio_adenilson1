package almeida.adenilson.uno.morintegraocomjava.database_app.tabelas;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_resposta",
        indices = {@Index(value = "id", unique = true),
                @Index(value = "perguntaId", unique = true),
                @Index(value = "resposta", unique = true)})

public class Resposta {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private int perguntaId;
    private String resposta;

    public Resposta() {
    }

    //Construtor de cópia
    public Resposta(Resposta tbl_resposta){
        this.id = tbl_resposta.getId();
        this.perguntaId = tbl_resposta.getPerguntaId();
        this.resposta = tbl_resposta.getResposta();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPerguntaId() {
        return perguntaId;
    }

    public void setPerguntaId(int perguntaId) {
        this.perguntaId = perguntaId;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
