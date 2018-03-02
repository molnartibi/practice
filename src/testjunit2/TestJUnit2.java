
package testjunit2;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class TestJUnit2 {
    
    private ArrayList<String>  people = new ArrayList();
    
   
    public void add(String newPerson){
        people.add(newPerson);
        
    }
    
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
    
    public int size(){
        return people.size();
    }
    
    public boolean isEmpty(){
        return people.isEmpty();
    }
   
    
}
