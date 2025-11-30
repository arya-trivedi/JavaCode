public class IncreaseNumberAndWidth {
    public static void main(String[] args){
        for(int i = 1; i <= 3; i++){// starts the pattern from 1 and increases to 3
            for(int j = 1; j <= i; j++){ //then until i, j is increased i times
                System.out.print(i); 
            }
            System.out.println();
        }

    }
}
