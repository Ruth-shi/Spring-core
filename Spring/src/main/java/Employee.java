import java.util.Map;

public class Employee {

    private int id;
    private String name;
    private Address addr;

    private Map<Integer, String> myMap;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, Address addr, Map <Integer, String> myMap) {
        this.id = id;
        this.name = name;
        this.addr = addr;
        this.myMap = myMap;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, String> getMyMap() {
        return myMap;
    }

    public void setMyMap(Map<Integer, String> myMap) {
        this.myMap = myMap;
    }

    public void display(){
        System.out.println("Emp ID: " + id);
        System.out.println("Emp name: " + name);
        System.out.println("EMP ADDR: "+ addr.toString());

        myMap.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("---------------------------------------------------");


    }
}

