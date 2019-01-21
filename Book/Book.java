class Book{
    private String Title;
    private String authorName;
    private int numberOfPage;

    public String getTitle(){
        return this.Title;
    }
    public String getAuthor(){
        return authorName;
    }
    public int getNumPage(){
        return this.numberOfPage;
    }

    public void setTitle(String newTitle){
        this.Title = newTitle;
    }
    public void setAuthor(String newAuthor){
        this.authorName = newAuthor;
    }
    public void setNumPage(int newNumPage){
        this.numberOfPage = newNumPage;
    }
    public Book(){

    }
    public Book(String NewTitle){
        this.Title = NewTitle;
    }
    public Book(String Title,int numberOfPage){
        this.Title = Title;
        this.numberOfPage = numberOfPage;
    }
   
}