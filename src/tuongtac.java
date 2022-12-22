public class tuongtac implements Dam{
    private Hero hero;
    private Weapon weapon;

    public tuongtac(Hero hero, Weapon weapon) {
        this.hero = hero;
        this.weapon = weapon;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public boolean buy(){
        if(hero.getMoney()>=weapon.getPrice()) {
            hero.setWeapon(weapon);
            hero.setMoney(hero.getMoney() - weapon.getPrice());

            return true;
        }else {
            System.out.println("bạn không đủ tiền vui lòng đi pham quái để có tiền ^_^");
            hero.getMoney();

            return false;

        }
    }

    @Override
    public double Dam() {
        if(buy()){
            return hero.setPower(hero.getPower()+weapon.getDamage());
        }
        return hero.getPower();
    }
}




//            hero.setPower(hero.getPower()+weapon.getDamage());
//            hero.getPower();