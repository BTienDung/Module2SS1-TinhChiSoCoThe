package season1.ChiSoCoThe;

import java.util.Scanner;

public class ChiSoCoThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap chieu cao: ");
        float chieuCao = sc.nextFloat();
        System.out.printf("Nhap can nang: ");
        float canNang = sc.nextFloat();
        float bmi = canNang/(chieuCao*chieuCao);
        if(bmi<18){
            System.out.println("Underweight");
        } else if (bmi>=18&&bmi<25){
            System.out.println("Nomal");
        } else if (bmi>=25&&bmi<30){
            System.out.println("Overweight");
        } else if (bmi >=30){
            System.out.printf("Obese");
        }
    }
}
