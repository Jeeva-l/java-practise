public class NestedIfJava {

    public static void main(String[]args)
    {
        int i=45;

        if(i==45){
            System.out.println("i==50");
            if(i<75){
                System.out.println("i is small then 75");
                if(i>55){
                    System.out.println("i is lesstan 55");
                }
            }
        }

    }
}
