public class Address {

    private String city;
    private String state;
    private int pin;

    public Address(String city,String state,int pin){
        this.city = city;
        this.state = state;
        this.pin = pin;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getPin() {
        return pin;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return
                "City=" + city +
                ", State=" + state +
                ", Pin=" + pin ;
    }
}

