import java.util.ArrayList;

public class Array_list {
    private ArrayList<String> names;

    //Default constructor
    public Array_list(){
        this.names = new ArrayList<>();
    }

    //parameterized constructor
    public Array_list(ArrayList<String> initialNames){
        this.names = new ArrayList<>(initialNames);
    }

    //Copy Constructor
    public Array_list(Array_list other){
        this.names = new ArrayList<>(other.names);
    }

    //method for adding name in array list
    public void addName(String name){
        names.add(name);
        System.out.println(name + " is added into the List");
    }

    // method for removing names in arraylist
    public void removeName(String name){
        if(names.contains(name)){
            names.remove(name);
            System.out.println(name + " is removed from the List");
        }else {
            System.out.println("Name not found!");
        }
    }

    public String printingNames(){
        String result = "";
        for(String name: names){
            result += name + "\n";  //every time a new String object is created so for large lists it will be slow process.
        }
        return result;
    }

    @Override
    public String toString(){
        return "the final array list is:" + "\n"+ printingNames();
    }
}