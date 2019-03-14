
class main {
    public static void main(String args[]){
        PersonList List = new PersonList();
        Teacher  T  = new Teacher("Donnukrit",22,"Engineering");
        PermaEmployee P = new PermaEmployee("Teerapong", 21, "001", 15000);
        ContactEmployee C = new ContactEmployee("Nawapong", 19, "002", 20000);
        
        List.addPerson(T);
        List.addPerson(P);
        List.addPerson(C);

       List.ShowAll();
    }
}