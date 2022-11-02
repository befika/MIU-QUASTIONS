package Q1;
public class Quastion1 {
    public static void main(String[] args) {
        System.out.println(isEvens(246));
    }

    //

    static int isEvens(int n){
        while(n>2){
            if (n%2 !=0){
                return 0;
            } 
            n=n/10;
        }
       return 1; 
    }


}


