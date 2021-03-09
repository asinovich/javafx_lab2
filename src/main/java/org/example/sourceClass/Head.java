package org.example.sourceClass;

import java.util.ArrayList;

public class Head {

    public ArrayList<Organ> organ= new ArrayList<Organ>();

    public Head(String healthy){
        organ.add(new Brain(healthy));
        organ.add(new Nose());
        organ.add(new Mouth());
    }

}
