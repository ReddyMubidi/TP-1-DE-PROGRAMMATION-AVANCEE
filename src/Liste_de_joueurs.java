import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;
public class Liste_de_joueurs {
    public static void main(String[] args) {
        List<String> nom_joueur = new LinkedList<>();
        nom_joueur.add("EDEN PARK");
        nom_joueur.add("HENOCK KAMB");
        nom_joueur.add("jERRY LUNDA");
        nom_joueur.add("BAILO CANTO");
        nom_joueur.add("REDDY AMISI");
        nom_joueur.add("LORENZO MZRTINI");
        nom_joueur.add("DOLCE GABANA");
        nom_joueur.add("PIERRE CARTIN");
        nom_joueur.add("JEMMY WEESTON");
        nom_joueur.add("PULADINI MARTIN");
        nom_joueur.add("DIOR CHANEL");
        System.out.print("VOICI LA LISTE DES JOUEURS");
        Iterator num = nom_joueur.iterator();
        while(num.hasNext()) {
            System.out.println(num.next());
        }
    }
}
