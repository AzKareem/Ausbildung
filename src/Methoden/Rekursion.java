package Methoden;

public class Rekursion {
    public static void main(String[] args) {
       //   rekursionMethode(1);
      //  ohneRekursiveMethode(-10);
     //   System.out.println(addNumbersIteration(5));


        System.out.println(addNumbersRecursive(6));
    }
    public static void rekursionMethode(int n) {
        if (n > 100) {
            return;
        }
        System.out.print(n + ", ");
        rekursionMethode(n + 1);
    }

    public static void ohneRekursiveMethode(int n) {
        for (int i = n; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
public static int addNumbersRecursive(int a){

        if (a <= 1){
            return 1;
        }
        else {
            return a + addNumbersRecursive(a-1);
        }
}

public static int addNumbersIteration(int a){
        int summe =0;
    for (int i = 0; i <= a; i++) {
        summe += i;
    }
    return summe;
}

}
