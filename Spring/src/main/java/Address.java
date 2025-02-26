class Address {

    private int id;
    private String city;
    private String state;

    public Address(int id, String city, String state){
        this.id = id;
        this.city = city;
        this.state = state;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state = state;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}