class main {
    public static void main(String args[]){
        Teacher  T  = new Teacher("Donnukrit",22,"Engineering");
        PermaEmployee P = new PermaEmployee("Teerapong", 21, "001", 15000);
        ContactEmployee C = new ContactEmployee("Nawapong", 19, "002", 20000);
        T.printDetails();
        T.print_faculty();
        System.out.println("");
        P.printDetails();
        P.print_eid();
        P.print_salary();
        System.out.println("");
        C.printDetails();
        C.print_eid();
        C.print_payment();
    }
}