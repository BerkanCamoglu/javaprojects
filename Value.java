public class Value {
      static int x = 3;
      public static void main(String[] args) {
            x = 5;
            int a = x;
            a = 2;
            System.out.print(x);
            x = 12;
            System.out.print("-" + a + "-");
            int[] dizi1 = {1,2,3};
            int[] dizi2 = {1,2,3};
            int[] dizi3;
            dizi2[1]=5;
            dizi1=dizi2;
            System.out.println(dizi1[1]);
      }
}