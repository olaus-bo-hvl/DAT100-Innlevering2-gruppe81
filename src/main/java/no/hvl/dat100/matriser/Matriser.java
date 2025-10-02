package no.hvl.dat100.matriser;

public class Matriser {


	// a)
	public static void skrivUt(int[][] matrise) {
        for (int[] rad : matrise) {
            for (int verdi : rad) {
                System.out.print(verdi + " ");
            }
            System.out.println();
        }
	}

	// b)
	public static String tilStreng(int[][] matrise) {

        if (matrise.length == 0) {
            return "[]";
        }
        String ferdigmatrise = "";
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < 3; j++)
                ferdigmatrise += matrise[i][j] + " ";
                if (i < matrise.length) {
                    ferdigmatrise += "\n";
            }
        }
        return ferdigmatrise;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
        int[][] nyMatrise= new int[matrise.length][matrise[0].length];          //lager matrise

        for(int i=0;i<matrise.length;i++){
            for (int j=0;j< matrise[i].length;j++){
                nyMatrise[i][j] = matrise[i][j] * tall;
            }
        }
        return nyMatrise;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length) return false;

        for (int i=0; i<a.length; i++){
            if (a[i].length != b[i].length) return false;

            for (int j=0; j<a[i].length; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

        int[][] nyMatrise= new int[matrise.length][matrise[0].length];

		for (int i=0; i < matrise.length; i++) {
            for (int j=0; j<matrise[i].length; j++) {
                nyMatrise[j][i] = matrise[i][j];
            }
        }
        return nyMatrise;
	
	}
}
