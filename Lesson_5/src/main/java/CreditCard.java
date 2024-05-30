public class CreditCard {

    int schet_num;
    double money;

    public CreditCard(int schet_num, double money){
        this.schet_num=schet_num;
        this.money=money;
    }
    public void inc(int dob){
        this.money=this.money+dob;
    }
    public void dec(int vich){
        this.money=this.money-vich;
    }
    public void pokaz(){
        System.out.println("Ваш номер счета: "+this.schet_num);
        System.out.println("Ваш счет: "+this.money);
    }
    public void setMoney(double money){
        this.money=money;
    }

    public double getMoney() {
        return money;
    }

    public void setSchet_num(int schet_num) {
        this.schet_num = schet_num;
    }

    public int getSchet_num() {
        return schet_num;
    }

}
