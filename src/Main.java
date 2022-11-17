public class Main {
    public static void main(String[] args) {

        System.out.println(contains(34, 2, 45, 6, 7, 86, 4));

        System.out.println(contains(4, 2, 45, 6, 7, 86, 4));

    }

       public static boolean contains (int a, int ... varargs) {

           for (int i = 0; i < varargs.length ; i++) {
               if (a==varargs[i]){
                   return true;
               }
           }

           return false;
    }
}