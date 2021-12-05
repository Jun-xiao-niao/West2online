package round2task1;

import java.time.LocalDate;

class Customer{

    private String name;
    private int ruaCatNumber;
    private LocalDate time = LocalDate.now();

    public Customer(String name, int ruaCatNumber) {
        this.name = name;
        this.ruaCatNumber = ruaCatNumber;
    }

    public LocalDate getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Customer  name: " + name +
                "\n          The number of times the customer want to rua cats: " + ruaCatNumber +
                "\n          Time to MyCatCafe: " + time;
    }
}