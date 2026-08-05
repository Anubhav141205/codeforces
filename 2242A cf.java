import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int k = sc.nextInt();
            int twice = 0;
            boolean ok = false;
            for(int i = 0; i<k;i++){
                int x = sc.nextInt();
                if(x>=3){
                    ok = true;
                }
                if(x>=2){
                    twice++;
                }
            }
            if(ok || twice >= 2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}