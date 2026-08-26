import java.util.*;
public class Main{
    static boolean canMake(String abbr, Set<Character> available){
        for(char c : abbr.toCharArray()){
            if(!available.contains(c)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            Set<Character> available = new HashSet<>();
            for(int i=0; i<N;i++){
                String word = sc.next();
                available.add(Character.toUpperCase(word.charAt(0)));
            }
            String[] abbr = new String[M];
            for(int i=0; i<M;i++){
                abbr[i] = sc.next();
            }
            boolean[] used = new boolean[M];
            int done = 0;
            boolean changed = true;
            while(changed){
                changed = false;
                for(int i=0; i<M;i++){
                    if(!used[i] && canMake(abbr[i], available)){
                        used[i] = true;
                        done++;
                        available.add(abbr[i].charAt(0));
                        changed = true;
                    }
                }
            }
            System.out.println(done == M ? "YES" : "NO");
        }
        sc.close();
    }
}