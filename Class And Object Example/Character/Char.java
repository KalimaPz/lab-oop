class Char{
    private int char_id;
    private String char_name;
    private int char_level;
    private String char_class;
   
    public String getName(){
        return this.char_name;
    }
    public int getLevel(){
        return this.char_level;
    }
    public int getID(){
        return this.char_id;
    }
    public Char(int id,String name,int lv){
        this.char_id = id;
        this.char_name = name;
        this.char_level = lv;
    }
}