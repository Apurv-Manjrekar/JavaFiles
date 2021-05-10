import java.util.ArrayList;

public class DogKennel {
    /* holds the dogs that are currently in this kennel */
    private ArrayList <Dog> dogs;  

    public DogKennel() {
        dogs = new ArrayList();
    }

    /* adds a new dog to the end of the list of dogs at this kennel */

    public void addAdog(Dog d) {
        dogs.add(d);
    }

    /* returns true if the argument dogName is the name of  one (or more) dogs 
     * in the kennel
     */
    public boolean find(String dogName) {
        for(int i = 0; i < dogs.size(); i++){
            if(dogs.get(i).getName().equals(dogName)){
                return true;
            }
        }
        return false;
    }

    /* searches through the list of dogs and removes all dogs in this kennel
     * that have this name. It returns true if at least one dog was found (and 
     * was removed).
     */
    public boolean remove(String dogName) {
        int amtRemoved = 0;
        for(int i = 0; i < dogs.size(); i++){
            if(dogs.get(i).getName().equals(dogName)){
                dogs.remove(i);
                amtRemoved++;
            }
        }
        if(amtRemoved >= 1){
            return true;
        }
        else{
            return false;
        }
    }

    /* returns an ArrayList of Dogs that have at least as many medals
     * as that given in the argument. If no dogs are found that have at least 
     * this many medals, an empty ArrayList is returned. 
     */
    public ArrayList<Dog> findChampions( int medals) {
        ArrayList<Dog> champs = new ArrayList();
        for(int i = 0; i < dogs.size(); i++){
            if(dogs.get(i).getMedals() >= medals){
                champs.add(dogs.get(i));
            }
        }
        return champs;
    }
}
