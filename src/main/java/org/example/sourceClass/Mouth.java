package org.example.sourceClass;

import java.util.Random;

public class Mouth extends Organ{

    public String size;

    public Mouth(){
        Random rand = new Random();
        final int arraySize[] = {15, 115, 130, 89, 666, 10, 50, 80};
        final String mouthType[] = {"Малютка", "Нормас", "Большой", "Невероятный",};

        this.weight = arraySize[rand.nextInt(8)];
        this.size = mouthType[rand.nextInt(4)];
    }

    public String eat(String kpd){
        if(kpd == "Здоровый") {
            final String[] mouthTypeMessageEat = {"Очень вкусно", "Ммм, попробуй тоже!", "Вкуснятина"};
            Random rand = new Random();

            return mouthTypeMessageEat[rand.nextInt(3)];
        }
        else if(kpd == "Приболел"){
            final String[] mouthTypeMessageEat = {"Что-то не очень", "Как-то не вкусно", "Могло быть и лучше"};
            Random rand = new Random();

            return mouthTypeMessageEat[rand.nextInt(3)];
        }
        else{
            final String[] mouthTypeMessageEat = {"Что это?", "Сам ешь такое!", "Отвратительно как ты!"};
            Random rand = new Random();

            return mouthTypeMessageEat[rand.nextInt(3)];
        }
    }

    public String speak(String kpd){

        if(kpd == "Здоровый") {
            final String[] mouthTypeMessageSpeak = {"Сегодня твой день", "Привет!", "Ты классный!", "Как день проходит?"};
            Random rand = new Random();

            return mouthTypeMessageSpeak[rand.nextInt(4)];
        }
        else if(kpd == "Приболел"){
            final String[] mouthTypeMessageSpeak = {"Не хочу общаться", "Пока", "Дела не очень"};
            Random rand = new Random();

            return mouthTypeMessageSpeak[rand.nextInt(3)];
        }
        else{
            final String[] mouthTypeMessageSpeak = {"Не хочу общаться с вонючкой", "Прощай", "Иди погуляй"};
            Random rand = new Random();

            return mouthTypeMessageSpeak[rand.nextInt(3)];
        }
    }

    public String getSize(){
        return this.size;
    }

    public void setParameter(){
        Random rand = new Random();
        final int arraySize[] = {15, 115, 130, 89, 666, 10, 50, 80};
        final String mouthType[] = {"Малютка", "Нормас", "Большой", "Невероятный",};

        this.weight = arraySize[rand.nextInt(8)];
        this.size = mouthType[rand.nextInt(4)];
    }

}
