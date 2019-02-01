class main{
    public static void main(String Args[]){
  //      System.out.println("HelloWorld!");
        Student S1;
            S1 = new Student();
                S1.setName("Donnukrit");
                S1.setLastname("Satirakul");
                S1.setAge(22);
                S1.setYear(3);
            S1.Introduce();
            System.out.println("Year = "+ S1.getYear());
    }
}