import java.util.*;
public class rough {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        Deque <Integer> de =new LinkedList<>();
        int c=0;
        int max=0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            System.out.println(c);
            if(!de.contains(num))
            {

                c++;
            }
            de.add(num);

            if(de.size()==m){
                System.out.println("1"+c);
                if(max<c){
                    max=c;
                }
                int x=de.removeFirst();

                c=c-1;

            }




        }
        System.out.println(max);


    }
}



