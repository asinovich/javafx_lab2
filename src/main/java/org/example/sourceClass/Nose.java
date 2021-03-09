package org.example.sourceClass;


import java.util.Random;

public class Nose extends Organ{

    private String form;

    public Nose(){
        Random rand = new Random();
        final int arraySize[] = {25, 125, 100, 99, 537, 10, 50, 80};
        final String[] noseType = {"Маленький", "Стандартый", "Большой", "Огромный", "Огооо, что это?"};

        this.weight = arraySize[rand.nextInt(8)];
        this.form = noseType[rand.nextInt(5)];
    }

    public String sniff(String kpd){

        if(kpd == "Здоровый") {
            final String[] noseTypeMessageSniff = {"Вкусно пахнет", "Оооо, мне такое нравится", "Что-то интересное"};
            Random rand = new Random();

            return noseTypeMessageSniff[rand.nextInt(3)];
        }
        else if(kpd == "Приболел"){
            final String[] noseTypeMessageSniff = {"Не очень", "Невкусно пахнет", "Я не чувствую запохи"};
            Random rand = new Random();

            return noseTypeMessageSniff[rand.nextInt(3)];
        }
        else{
            final String[] noseTypeMessageSniff = {"Мммм, х...", "Ужас какой-то", "Убери это!"};
            Random rand = new Random();

            return noseTypeMessageSniff[rand.nextInt(3)];
        }
    }

    public String itch(String kpd){

        if(kpd == "Здоровый") {
            final String[] noseTypeMessageItch = {"Оооо, да", "Кайффф", "Балдёж"};
            Random rand = new Random();

            return noseTypeMessageItch[rand.nextInt(3)];
        }
        else if(kpd == "Приболел"){
            final String[] noseTypeMessageItch = {"Больно", "Фуу", "Лучше так не делать"};
            Random rand = new Random();

            return noseTypeMessageItch[rand.nextInt(3)];
        }
        else{
            final String[] noseTypeMessageItch = {"ААААА", "Эта сапля, прям как ты", "Эхх"};
            Random rand = new Random();

            return noseTypeMessageItch[rand.nextInt(3)];
        }
    }

    public String getForm(){
        return this.form;
    }

    public void setParameter(){
        Random rand = new Random();
        final int arraySize[] = {25, 125, 100, 99, 537, 10, 50, 80};
        final String[] noseType = {"Маленький", "Стандартый", "Большой", "Огромный", "Огооо, что это?"};

        this.weight = arraySize[rand.nextInt(8)];
        this.form = noseType[rand.nextInt(5)];
    }
}




