public class stringC {
    public static void main(String[] args){
        String name = "java";
        System.out.println(name);

        System.out.println(name.length());
        System.out.println(name.indexOf("v"));
        System.out.println(name.charAt(3));
        System.out.println(name.substring(3,8));

        for (int index = 0; index < name.length(); index++){
            System.out.println(name.charAt(index));
        }

        for (int index = name.length()-1; index > 0; index--){
            System.out.println(name.charAt(index));
        }




    }
}
