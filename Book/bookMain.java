class bookMain{
    public static void main(String args[]){
        Book myBook1 = new Book();
        Book myBook2 = new Book("Java Programing");
        Book myBook3 = new Book("C Programing",500);

        myBook1.setTitle("OOP");
        myBook1.setNumPage(1000);
        myBook2.setTitle("Network");
        myBook2.setNumPage(600);

        System.out.println(myBook1.getTitle()+"\t\t\tNumber of Page : "+myBook1.getNumPage()+"\tAuthor : "+myBook1.getAuthor());
        System.out.println(myBook2.getTitle()+"\t\t\tNumber of Page : "+myBook2.getNumPage()+"\tAuthor : "+myBook2.getAuthor());
        System.out.println(myBook3.getTitle()+"\t\tNumber of Page : "+myBook3.getNumPage()+"\tAuthor : "+myBook3.getAuthor());
    }
}