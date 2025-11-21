public class UnicodePrinter {
    public static void main(String[] args) {
        for(char ch='a';ch<='z';ch++){
            int unicode =ch;
            System.out.println("Character: " + ch + " Unicode: " + unicode);
        }
    }
}
