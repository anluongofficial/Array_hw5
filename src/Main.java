public class Main {
    public static void main(String[] args) {
        int[] org = {-3,2,6,-11};
        int cul = 0;

        for(int i = 0; i < org.length; i++)
        {
            cul = cul + org[i];
            System.out.print(cul +" ");
        }
    }
}