import java.util.Scanner;

public class 停車費計算 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int h1=scn.nextInt();
        int m1=scn.nextInt();
        int h2=scn.nextInt();
        int m2=scn.nextInt();
        int min=(h2*60+m2)-(h1*60+m1);
        int total;

        if(min<120){
            total=30*(min/30);
        }
        else if (min<240){
            min=min-120;
            total=120+40*(min/30);
        }
        else {
            min=min-240;
            total=120+160+60*(min/30);
        }
        System.out.println(total);
    }
}
