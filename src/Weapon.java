public class Weapon {
    private String name;

    private int price;
    private double Damage;

    public Weapon(String name,int price, double damage) {
        this.name=name;
        this.price = price;
        Damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return Damage;
    }

    public void setDamage(double damage) {
        Damage = damage;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", Damage=" + Damage +
                '}';
    }
}
