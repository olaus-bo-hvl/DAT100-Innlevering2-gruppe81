package no.hvl.dat100.tabeller;

public class Tabeller {

    // a)
    public static void skrivUt(int[] tabell) {

        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i]);
        }
        System.out.println();

    }

    // b)
    public static String tilStreng(int[] tabell) {
        if (tabell.length == 0) {
            return "[]";
        }
        String ferdigtabell = "[";
        for (int i = 0; i < tabell.length; i++) {
            ferdigtabell += tabell[i];
            if (i < tabell.length - 1) {
                ferdigtabell += ",";
            }
        }
        ferdigtabell += "]";
        return ferdigtabell;
    }

    // c)
    public static int summer(int[] tabell) {

        int sum = 0;
        for (int i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }
        return sum;
    }

    // d)
    public static boolean finnesTall(int[] tabell, int tall) {

        for (int tallitabell : tabell) {
            if (tallitabell == tall) {
                return true;
            }
        }
        return false;
    }

    // e)
    public static int posisjonTall(int[] tabell, int tall) {

        for (int i = 0; i < tabell.length; i++) {
            if (tall == tabell[i]) {
                return i;
            }
        }
        return -1;
    }
    // f)
    public static int[] reverser(int[] tabell) {

        int[] reverstabell = new int[tabell.length];
        for (int i = 0; i < tabell.length; i++) {
            reverstabell[i] = tabell[tabell.length - 1 - i];
        }
        return reverstabell;
    }

    // g)
    public static boolean erSortert(int[] tabell) {

        for (int i = 0; i < tabell.length - 1; i++) {
            if (tabell[i] > tabell[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // h)
    public static int[] settSammen(int[] tabell1, int[] tabell2) {

        int[] sammen = new int[tabell1.length + tabell2.length];


        for(int i = 0; i < tabell1.length; i++){
            sammen[i] = tabell1[i];
        }
        for(int i = 0; i < tabell2.length; i++){
            sammen[tabell1.length + i] = tabell2[i];
        }

        return sammen;
    }
}