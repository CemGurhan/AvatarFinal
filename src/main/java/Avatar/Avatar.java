package Avatar;

import Action.Blast;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Avatar implements Blast {

    protected String name;
    private int age;
    private boolean good;
    protected String element;
    private int distance;
    private int amount;
    protected int temp;
    private HashMap<String, Integer> blast_amount;


    public Avatar(String name, int age, boolean good){
        this.name = name;
        this.age = age;
        this.good = good;
        this.blast_amount = new HashMap<>();
    }


    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGood() {
        return good;
    }

    public void setGood(boolean good) {
        this.good = good;
    }

    public void blast(int distance, int amount, int temp, Avatar avatar){
        this.element = avatar.getElement();
        this.distance = distance;
        this.amount = amount;
        this.temp = temp;
        this.blast_amount.put(avatar.getName(), amount);
    }

//    public String winner(){
//        // array ontains amoount: value
//        blast_amount.values();
//        // comapre the values in arrray
//        // get the key of the bigger value
//        if(blast_amount.size() == 2){
//            if(){
//                return "blast_amount.get(0).getN";
//        }
//    }




}
