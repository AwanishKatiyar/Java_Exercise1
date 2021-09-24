enum House {
    HOUSE1(10), HOUSE2(20), HOUSE3(30);
    private int price;
    House(int price) {
        this.price = price;
    }
    int getPrice() {
        return price;
    }
}
public class Ques9 {
    public static void main(String[] args) {
        House penthouse = House.HOUSE3;
        House duplex = House.HOUSE1;
        House multistorey = House.HOUSE2;
        System.out.println("Price of a duplex " + duplex.getPrice());
        System.out.println("Price of a penthouse " + penthouse.getPrice());
        System.out.println("Price of a multistorey " + multistorey.getPrice());
    }
}
