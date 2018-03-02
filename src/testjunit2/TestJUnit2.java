
package testjunit2;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class TestJUnit2 {
    
    private ArrayList<String>  people = new ArrayList();
    
   /**A paraméterben megadott stringet hozzáadja a tömbhöz*/
    public void add(String newPerson){
        people.add(newPerson);
        
    }
    
    /**A paraméterként átadott elemet törli a tömbből*/
    public void remove(String person){
        if (!people.contains(person)){
            throw new NoSuchElementException();
        }
        people.remove(person);
    }
    
    /**Az ArrayListből kitöröl mindent a faszba.*/
    public void removeAll(){
        people.clear();
    }
    
    /*/Visszaadja a tömb méretét*/
    public int size(){
        return people.size();
    }
    
    /**Vizsgálja, hogy üres-e az ArrayList*/
    public boolean isEmpty(){
        return people.isEmpty();
    }
   
    
}
