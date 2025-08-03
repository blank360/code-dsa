public class bitmani{
    private static String reverse( String s){
        String rev = " ";
        for(int i = s.length()-1 ; i >= 0 ; i-- ){
            rev = rev + s.charAt(i);
        }
        return rev;

    }
    private static String convertobit(int n){
        String s = " ";
        int k;
        while(n != 0){
            k = n%2;
            if(k == 1) s = s + '1';
            else s= s+ '0';
            n = n/2;
        }
        s = reverse(s);
        return s;
    }
    public static void main(String [] args){
        int k = 50;
        String s = convertobit(k);
        System.out.print(s);

    }   
}