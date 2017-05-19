package sample;

import java.util.Random;

/**
 * Created by jafer on 17/05/17.
 */
public class Cliente {

    private int id;

    private Relogio tempoChegadaRelogio;

    private int tempoAtendimento;

    private int tempoInicioAtendimento;
    private int tempoInicioServico;
    private int tempoClienteNaFila;
    private Relogio tempoFinalAtendimento;
    private int tempoClienteNoBanco; //fila+atendimento
    private int tempoCaixa; // tempo que o caixa ficou ocupado ou livre
    private Relogio relogio = Relogio.getInstance();
    public Cliente() {
        id +=1;

    }


    public int getId() {
        return id;
    }

    public int getTempoUltimaChegada(){

        Random r = new Random();
        int s = r.nextInt(100);
        if(s<35){
            relogio.setMinuto(10);
            return  10;
        }else if(s>=35 && s<75){
            relogio.setMinuto(12);
            return 12;
        }else{
            relogio.setMinuto(14);
            return 14;
        }

    }

    public Relogio getTempoChegadaRelogio() {
        return tempoChegadaRelogio;
    }

    public int getTempoAtendimento(){
        return 0;
    }






}
