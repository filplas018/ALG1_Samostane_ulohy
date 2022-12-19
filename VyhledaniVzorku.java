package samostatnaPrace.ALG1_Samostane_ulohy;

import java.util.Scanner;

public class VyhledaniVzorku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTasks = scanner.nextInt();
        for (int i = 0; i < numTasks; i++) {
            String originalMessage = "";
            while (!scanner.nextLine().isEmpty()){
                originalMessage = scanner.nextLine();
            }
               String encryptedSample = scanner.nextLine();

            boolean canAppear = canAppear(originalMessage, encryptedSample);
            if (canAppear) {
                System.out.println("Vyskyt vzorku je mozny");
            } else {
                System.out.println("Vyskyt vzorku neni mozny");
            }
        }
    }

    public static boolean canAppear(String originalMessage, String encryptedSample) {
        String alphabeticalRing = "QWERTYUIOPASDFGHJKLZXCVBNM_ ";
        for (int K = 1; K < 27; K++) {
            String encryptedMessage = "";
            for (int j = 0; j < originalMessage.length(); j++) {
                char character = originalMessage.charAt(j);
                int position = alphabeticalRing.indexOf(character);
                char encryptedCharacter = alphabeticalRing.charAt((position + K) % 27);
                encryptedMessage += encryptedCharacter;
            }
            if (encryptedMessage.contains(encryptedSample)) {
                return true;
            }
        }
        return false;
    }
}
/**
 2

 PREDNASKA Z ALP JE V UTERY DOPOLEDNE

 VFRXUR RAOUIPR

 MOZNA PRIJDE I KOUZELNIK

 F HMZZYWLHBHH*/