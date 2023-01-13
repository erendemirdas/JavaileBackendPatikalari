public class MatrisTranspozonu {
    public static void main(String[] args) {
        int[][] matris = {
                {1,2,3},
                {4,5,6}
        };
        int matrisRow = matris.length;
        int matrisCol = matris[0].length;
        int[][] transpozon = new int[matrisCol][matrisRow];

        for(int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++){
                transpozon[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris : ");
        for(int[] i : matris) {
            for (int j : i) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
        System.out.println("Transpozonu : ");
        for(int[] i : transpozon){
            for(int j : i){
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}