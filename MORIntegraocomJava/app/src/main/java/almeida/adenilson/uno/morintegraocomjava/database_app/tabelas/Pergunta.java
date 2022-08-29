package almeida.adenilson.uno.morintegraocomjava.database_app.tabelas;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_pergunta",
indices = {@Index(value = "id", unique = true),
        @Index(value = "provaId", unique = true),
        @Index(value = "pergunta", unique = true)})

public class Pergunta {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private int provaId;
    private String pergunta;

    public Pergunta() {
    }

    //Construtor de cópia
    public Pergunta(Pergunta tblPergunta){
        this.id       = tblPergunta.getId();
        this.provaId = tblPergunta.getProvaId();
        this.pergunta = tblPergunta.getPergunta();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvaId() {
        return provaId;
    }

    public void setProvaId(int provaId) {
        this.provaId = provaId;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }
}

