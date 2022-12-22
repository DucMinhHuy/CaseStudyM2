public class Hero {
    private int money;
    private int hp;
    private double power;
    private Object weapon;

    public Hero(int money, int hp,double power) {
        this.money = money;
        this.hp = hp;
        this.power=power;
    }

    public Hero(int money, int hp, Object weapon,double power) {
        this.money = money;
        this.hp = hp;
        this.weapon = weapon;
        this.power=power;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Object getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public double getPower() {
        return power;
    }

    public double setPower(double power) {
        this.power = power;
        return power;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "weapon=" + weapon +
                '}';
    }
}
