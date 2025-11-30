public class NumberPyramid {
    public static void main(String[] args){
        System.out.println(numberPyramid(4));
    }
    public static String numberPyramid(int n) {
        String str = "";
        int i,j,k;
        for (i = 1; i <= n; i++){
            for(j = 1-n; j <= n - 1; j++) {
                int jAbs = Math.abs(j);
                if(jAbs < i){
                    str = str + (n-jAbs);
                }else{
                    str += " ";
                }
            }
            str += "\n";
        }
        return str;
    }
}
