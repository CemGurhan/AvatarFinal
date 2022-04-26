package Avatar;

public class Water extends Avatar {
    private String tribe;
    private String liquidState;

    public Water (String name, int age, boolean good, String tribe){
        super(name, age, good);
        this.tribe = tribe;
        this.liquidState = "liquid";
        this.element = "Avatar.Water";
    }

    public String getTribe() {
        return tribe;
    }

    public void setTribe(String tribe) {
        this.tribe = tribe;
    }

    public String getLiquidState() {
        return liquidState;
    }

    public void setLiquidState(String liquidState) {
        this.liquidState = liquidState;
    }


    public void freezeWater(){
        this.liquidState = "ice";
    }

}
