import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

public class Lesson_4 {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int chislo= in.nextInt();
        boolean flag=true;
        for (int i=0;i<=9;i++)
        {
            if (arr[i]==chislo)
            { flag=false;
                System.out.println("Ваше число есть в массиве и находится на "+(i+1)+" месте ");
                break;
            }
        }
        if (flag == true)
        {
            System.out.println("Вашего числа нет в массиве");
        }
        ///2
      int arr_del[]=new int[10];
        System.out.println("Введите 10 элементов массива");
        for (int i=0;i<=9;i++)
        {
            System.out.println("Введите "+(i+1)+" число");
            arr_del[i] = in.nextInt();
        }
        System.out.println("Введите число которое надо удалить");
        int del = in.nextInt();
        int schet=0;
        boolean est=false;
        for (int i=0;i<=arr_del.length-1;i++)
        {
          if (del==arr_del[i])
          {
              est=true;
              schet++;
          }
        }
        int new_mas=arr.length-schet;
        int[] arr_new = new int[new_mas];
        int k=0;
        for (int i=0;i<=arr_del.length-1;i++)
        {
            if(arr_del[i]!=del)
            {
                arr_new[k]=arr_del[i];
                k++;
            }
        }
        if(est==false)
        {
            System.out.println("Нет такого числа");
        }
        if(est==true) {
            System.out.println(Arrays.toString(arr_new));
        }
        ///3
        int n =16;
        double[] mas_ran = new double[n];
        for (int i=0;i<n;i++)
        {
            mas_ran[i]= Math.random()*100;
        }
        double min=mas_ran[0];
        double max=mas_ran[0];
        for (int i=0;i<n;i++)
        {
            if(min>mas_ran[i])
            {
                min=mas_ran[i];
            }
            if(max<mas_ran[i])
            {
                max=mas_ran[i];
            }
        }
        double sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+mas_ran[i];
        }
        double sred=sum/n;
        System.out.println(Arrays.toString(mas_ran));
        System.out.println("Максимальное число в массиве "+max);
        System.out.println("Минимальное число в массиве "+min);
        System.out.println("Среднее значение в массиве "+sred);
        ///4
        double[] mas_ran_4 = new double[20];
        for(int i=0;i<mas_ran_4.length;i++)
        {
            mas_ran_4[i] = Math.random()*100;
        }
        int p=0;
        double[] mas_new_4 = new double[20];
        for (int i=mas_ran_4.length-1;i>=0;i--)
        {
           mas_new_4[p]=mas_ran_4[i];
           p++;
        }
        System.out.println(Arrays.toString(mas_ran_4));
        System.out.println(Arrays.toString(mas_new_4));
    }
}
