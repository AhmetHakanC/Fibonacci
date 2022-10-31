import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        long [] sayilar = {1, 1, 2};
        int basamak;
        System.out.print("Kaç basamak yazdırmak istersiniz? ---> ");
        Scanner girdi = new Scanner(System.in);
        basamak = girdi.nextInt();

        for(int i = 0; i < basamak-2; i++){
            if (i == 0){
                System.out.print(sayilar[0] + ", ");
                System.out.print(sayilar[1] + ", ");
            }
            System.out.print(sayilar[2] + ", ");
            sayilar[0] = sayilar[1];
            sayilar[1] = sayilar[2];
            sayilar[2] = sayilar[0] + sayilar[1];
        }
    }
}