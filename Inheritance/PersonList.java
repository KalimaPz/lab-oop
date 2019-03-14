import java.util.*;
class PersonList {
   private ArrayList<Object> persons;

   public void addPerson(Object p)
   {
      persons.add(p);
   }
   public void ShowAll()
   {  
      for(int i = 0; i < persons.size();i++)
      {
         System.out.println(persons.get(i));
      }
   }
   public PersonList()
   {
      persons = new ArrayList<Object>();
   }
}