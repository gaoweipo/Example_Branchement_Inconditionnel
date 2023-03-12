public class Main {
    public static void main(String[] args) {
        int i;
        for (i=1; i<=10; i++){
            System.out.println("Début de tour "+i+":");
            System.out.println("Bonjour");
            if (i==3)
                break;
            System.out.println("Fin de tour: "+i);
        }
        System.out.println("Après la boucle.");
    }
}

