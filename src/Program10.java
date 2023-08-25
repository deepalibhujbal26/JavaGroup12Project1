public class Program10 {
    public static void main(String[] args) {

        String[] words = {"jan", "oct", "feb", "nov", "oct"};

        String dups= "";

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if(words[i].equals(words[j])){
                    dups = words[i];
                }
            }
        }
        System.out.println(dups);
    }
}
