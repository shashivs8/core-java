public class Frequency {

    public static void main(String[] args) {
        String n = "Shashikumar";
        char ch = 'a';
        int frequency = 0;

        for(int i = 0; i < n.length(); i++) {
            if(ch == n.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}