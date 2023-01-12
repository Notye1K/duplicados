import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> frutas1 = new ArrayList<String>(List.of("Morango", "Uva", "Acerola", "Manga", "Bananinha"));
        List<String> frutas2 = new ArrayList<String>(List.of("Pera", "Caju", "Morango", "Kiwi", "Bananinha"));

        System.out.println("Itens em comum:");
        for (int i = 0; i < frutas1.size(); i++) {
            String element = frutas1.get(i);

            if (frutas2.contains(element)) {
                System.out.println(element);
            }
        }

        
    }
}
