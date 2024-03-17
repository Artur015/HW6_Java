package homework;


public class User implements Essence {
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
