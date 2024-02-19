import java.util.Scanner;

public class Silmukat {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int korkeus, leveys;
        
        do {
            System.out.print("Anna ruudukon korkeus: ");
            korkeus = lukija.nextInt();
            
            System.out.print("Anna ruudukon leveys: ");
            leveys = lukija.nextInt();
            
            if (korkeus < 1 || leveys < 1) {
                System.out.println("Virheellinen leveyden tai korkeuden arvo!");
            }
        } while (korkeus < 1 || leveys < 1);

        System.out.println();
        
        for (int i = 0; i < korkeus; i++) {
            for (int j = 0; j < leveys; j++) {
                System.out.print("X");
            }
            System.out.println();
        }

        lukija.close();
    }
}
