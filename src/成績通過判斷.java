import java.util.Scanner;

public class 成績通過判斷 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int fNum=0;
        int li,re,sp;
        for (int i=0;i<n;i++){
            li=scn.nextInt();
            re=scn.nextInt();
            sp=scn.nextInt();
            if(li>=0&&li<=100){
                if(li<60){
                    fNum++;
                }
                if(re<60){
                    fNum++;
                }
                if(sp<60){
                    fNum++;
                }
                if(fNum==0){
                    System.out.println("P");
                }
             else if (fNum==1){
                    if ((li+re+sp)>=220){
                        System.out.println("P");
                    }
                    else {
                        System.out.println("M");
                    }
                }
             else if (fNum==2){
                 if (li>=80){
                     System.out.println("M");
                 }
                   else if (re >= 80) {
                        System.out.println("M");
                    }
                   else if (sp>=80){
                     System.out.println("M");
                    }
                    else {
                        System.out.println("F");
                    }
                }
                else {
                    System.out.println("F");
                }
                fNum=0;
            }
        }
    }
}
