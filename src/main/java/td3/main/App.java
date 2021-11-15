package td3.main;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args){
        Consumer<String> cS = x -> System.out.println (x);
        List<String> ordis = Arrays.asList("Dell", "HP", "Lenovo", "IBM");
// Coupe une source en 2 listes
        Spliterator<String> ordisSplit = ordis.spliterator();
// 1ere partie de la partition
        Spliterator<String> partition1erePartie =
                ordisSplit.trySplit();
        //partition1erePartie.forEachRemaining( cS ) ; //affiche Dell et HP
// 2eme partie de la partition
        ordisSplit.forEachRemaining ( cS ) ; // affiche Lenevo et IBM
    }
}
