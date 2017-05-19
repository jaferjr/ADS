package sample;

import java.util.Random;

/**
 * Created by jafer on 17/05/17.
 */
 final class Relogio {

    private static final Relogio INSTANCE = new Relogio();


    private static int minuto;

    private Relogio(){
        minuto =0;
    }

    int getMinuto(){
        return minuto;
    }

    void setMinuto(int i){
        minuto+=i;
    }


    static Relogio getInstance(){
        return INSTANCE;
    }
    void addTempo(){
        Random r = new Random();
        minuto +=r.nextInt(60);

    }

    String getRelogio(){
        int hora = minuto/60;
        return hora+":"+minuto%60;
    }

}

