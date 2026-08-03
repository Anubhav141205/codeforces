import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int zero = s.indexOf("0");
            String Afteralice = s.substring(0,zero)+ s.substring(zero+1);
            int one = Afteralice.indexOf("1");
            String ans = Afteralice.substring(0,one)+ Afteralice.substring(one+1);
            System.out.println(ans);
        }
}
}