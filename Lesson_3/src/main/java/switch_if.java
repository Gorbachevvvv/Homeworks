import java.util.Scanner;

public class switch_if {
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Введите число от 1 до 12");
    int mounth = in.nextInt();
    switch (mounth){
        case (1):
            System.out.println("January");
            break;

        case (2):
            System.out.println("February");
            break;
        case (3):
            System.out.println("March");
            break;
        case (4):
            System.out.println("April");
            break;
        case (5):
            System.out.println("May");
            break;
        case (6):
            System.out.println("June");
            break;
        case (7):
            System.out.println("July");
            break;
        case (8):
            System.out.println("August");
            break;
        case (9):
            System.out.println("September");
            break;
        case (10):
            System.out.println("October");
            break;
        case (11):
            System.out.println("November");
            break;
        case (12):
            System.out.println("December");
            break;
        default:
            System.out.println("Не верный ввод");
            break;
    }
System.out.println("Введите число от 1 до 4");
    int pargod = in.nextInt();
    if (pargod == 1){
        System.out.println("Winter");
    }
    else if (pargod == 2) {
    System.out.println("Spring");
    }
    else if(pargod == 3){
        System.out.println("Summer");
    }
    else if(pargod == 4){
        System.out.println("Autumn");
    }
    else{
        System.out.println("Неверно");
    }
    System.out.println("Введите число");
    int number_chet = in.nextInt();
    if(number_chet%2==1){
        System.out.println("Нечетное");
    }
    else {
        System.out.println("Четное");
    }
    System.out.println("Введите число");
    int t = in.nextInt();
    if (t>-5){
        System.out.println("Тепло");
    }
    else if ( -5 >=t && t >-20){
        System.out.println("Нормально");
    }
   else if (-20 >=t){
        System.out.println("Холодно");
    }

    //Циклы
    for (int i=1;i<=99;i++){
        System.out.println(i);
        i++;
    }
    for (int i=5;i<=1;i--){
        System.out.println(i);
    }
    System.out.println("Введите число");
    int vvod= in.nextInt();
    for (int i=1;i<=vvod;i++){
        System.out.println(i);
    }
    int sem = 7;
    while(sem<=98){
        System.out.println(sem);
        sem=sem+7;
    }
}

}
