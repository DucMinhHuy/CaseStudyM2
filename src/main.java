import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Hero hero1 = null;
        Weapon weapon1 =null;
        Scanner sc=new Scanner(System.in);
        int choose=0;
        do{
            System.out.println("1.tao hero");
            System.out.println("2.tao weapon");
            System.out.println("3. sau khi mua weapon, sét theo money");

            choose=sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("nhap tien :");
                    int money=sc.nextInt();
                    System.out.println("nhap Damage :");
                    double damage=sc.nextDouble();
                    System.out.println("nhap hp :");
                    int hp=sc.nextInt();
                    hero1=new Hero(money,hp,damage);
                    break;
                case 2:
                    System.out.println("nhap ten :");sc.nextLine();
                    String name=sc.nextLine();
                    System.out.println("nhap tien :");
                    int price=sc.nextInt();
                    System.out.println("nhap Damage :");
                    double damage1=sc.nextDouble();
                    weapon1 =new Weapon(name,price,damage1);
                    break;
                case 3:
                    tuongtac tuongtac1=new tuongtac(hero1,weapon1);
                    System.out.println("thong tin tuong luc dau : {tien ="+hero1.getMoney()+",suc manh= "+hero1.getPower()+"}");
                    System.out.println("thong tin vu khi : {name="+weapon1.getName()+",tien="+weapon1.getPrice()+",dam="+weapon1.getDamage()+"}");
                    System.out.println("gan vu khi cho tuong :");
                    tuongtac1.Dam();
                    System.out.println("{ sức mạnh= "+hero1.getPower()+",tien hien tai= "+hero1.getMoney()+",có vũ khí :"+weapon1.getName()+"}");
                    break;


            }
        }while (choose!=0);
    }
}
