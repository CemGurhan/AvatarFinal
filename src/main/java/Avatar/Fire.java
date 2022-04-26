package Avatar;

import Avatar.Avatar;

public class Fire extends Avatar {

    private String colour;

    public Fire(String name, int age, boolean good, String colour ){
        super (name, age, good);
        this.colour = colour;
        this.element = "Avatar.Fire";
    }

    public String shootFire(){
        return this.name + " shoot fire at " + this.temp + " degrees";
    }



}
