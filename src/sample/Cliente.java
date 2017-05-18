package sample;

/**
 * Created by jafer on 17/05/17.
 */
public class Cliente {

    private static int id;
    private int tempoDeAtendimento;
    private int tempoNaFila;
    private int tempoNoBanco;
    private int inicioAtendimento;
    private int fimAtendimento;
    private int chegadaBanco;

    public Cliente() {
        id +=1;
        tempoDeAtendimento = 0;
        tempoNaFila =0;
        tempoNoBanco = 0;
        inicioAtendimento = 0;
        fimAtendimento =0;


    }

    public int getId() {
        return id;
    }

    public int getTempoDeAtendimento() {
        tempoDeAtendimento = fimAtendimento - inicioAtendimento;
        return tempoDeAtendimento;
    }

    public int getTempoNaFila() {

        return tempoNaFila;
    }

    public int getTempoNoBanco() {
        return tempoNoBanco;
    }

    public int getInicioAtendimento() {
        return inicioAtendimento;
    }

    public int getFimAtendimento() {
        return fimAtendimento;
    }
}
