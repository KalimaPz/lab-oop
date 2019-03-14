public class Pokemon {
    private String name;
    private int maxHP;
    private int HP;

    public Pokemon(String n){
        this.maxHP = (int)(Math.random()*100)+1;
        this.name = n;
        this.HP = (int)(Math.random()*this.maxHP)+1;
    }
    public String getName(){
        return this.name;
    }
    public void eat(){
        if(this.HP < this.maxHP - 10){
            this.HP+= 10;  // Left HP
        }
        else
            this.HP = 100; // Full HP
    }
    public String toString(){
        String s = "Name : " + this.name + " Max HP : " + this.maxHP + " HP : " + this.HP; 
        return s;
    }
}