package Avatar;

import Avatar.Avatar;

public class Air extends Avatar {

    public Air (String name, int age, boolean good){
        super(name, age, good);
        this.element ="Avatar.Air";
    }


    public void burnair(Fire fire){
        this.temp += fire.getHeat();
    }









}
