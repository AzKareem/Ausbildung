package Java_basic;

public class Working_with_Strings {
    public static void main(String[] args) {

        String name = "  Hello World  ";
        String replaceString = name.replace("World", "Codersbay");

        System.out.println((name.toLowerCase().stripLeading() + '\n').repeat(15));
        System.out.println((name.toUpperCase().stripLeading() + '\n').repeat(15));
        System.out.println((replaceString.toLowerCase().stripLeading() + '\n').repeat(15));
        System.out.println((replaceString.toUpperCase().stripLeading() + '\n').repeat(15));
    }
}
