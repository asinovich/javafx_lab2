package org.example.sourceClass;

import java.util.Random;

public class Brain extends Organ{

    public String kpd;

    public Brain(String healthy){
        Random rand = new Random();
        final int arraySize[] = {880, 1000, 450, 99, 1500, 10, 50, 720};

        this.weight = arraySize[rand.nextInt(8)];
        this.kpd = healthy;
    }

    public void manegeOrgan(String healthy) {
        this.kpd = healthy;
    }

    public String receiveSignal(String action, String messageFromOrgan) {
        return action + ": " + messageFromOrgan + "\n";
    }

    public String getKpd(){
        return this.kpd;
    }
}
