import java.util.Random;
import java.util.Scanner;
public class MineSweeper {
    int row ;
    int col ;
    int[][] gameMap ;
    int[][] mineMap ;
    int bombPiece ;
    boolean isContinue = true;
    int counter = 0;
    Random rand = new Random();
    Scanner inp = new Scanner(System.in);

    MineSweeper(int row , int col){ ///// KURUCU SINIFIMIZ /////
        this.row = row;
        this.col = col ;
        this.mineMap = new int[this.row][this.col] ;            ///// ADMİNİN GÖRDÜĞÜ MAP  /////
        this.gameMap = new int[this.row][this.col];          /////   OYUNCUNUN GÖRDÜĞÜ MAP  /////
        this.bombPiece = ((this.row * this.col) / 4);   ///// MAP BÜYÜKLÜĞÜNE GÖRE BOMBA SAYISI //////
    }

    public void print(int[][] array){  /////// MAP OLUŞTURULAN ve MAP ÜZERİNDE OLMASI GEREKEN ÇIKTILARI VERDİĞİMİZ KISIM ////////
        for (int i = 0 ; i < array.length ; i++){
            for (int j = 0 ; j < array[i].length ; j++){
                if (array[i][j] == 9){
                    System.out.print("*" + "   ");
                }else if (array[i][j] == 0){
                    System.out.print("-" + "   ");
                }else if (array[i][j] == -1){
                    System.out.print("0" + "   ");
                }else {
                    System.out.print(array[i][j] + "   ");
                }
            }
            System.out.println();
            System.out.println();
        }
    }

    public void bombLocation(){       ////// BOMBALARIN MAP ÜZERİNDEKİ RASGELE KONUMLARINI BELİRLEME VE BOMBA SAYISI KADAR BOMBAYI KONUMLARA ATADIĞI KISIM //////
        int rowLoc, colLoc , counter = 0;
        while (counter != this.bombPiece){
            rowLoc = rand.nextInt(this.row);
            colLoc = rand.nextInt(this.col);
                if (this.mineMap[rowLoc][colLoc] != 9) {
                    this.mineMap[rowLoc][colLoc] = 9;
                    counter++;
            }
        }
    }

    public void checkBomb(int a , int b){  ////// AÇTIĞIMIZ KONUMDA BOMBA YOKSA, KONUMUMUZUN SAĞ/SOL - ALT/ÜST ve ÇAPRAZLAR OLACAK ŞEKİLDE ÇEVRESİNİ KONTROL ETTİĞİ VE EKRANA ÇIKTI VERMEK İÇİN ÇEVRESİNDEKİ BOMBALARI SAYDIĞI KISIM /////
        if (this.mineMap[a][b] == 0) {
            if ((b < this.col - 1) && (this.mineMap[a][b + 1] == 9)) {
                this.gameMap[a][b]++;
            }
            if ((b > 0) && (this.mineMap[a][b - 1] == 9)) {
                this.gameMap[a][b]++;
            }
            if ((a < this.row-1) &&(this.mineMap[a + 1][b] == 9)) {
                this.gameMap[a][b]++;
            }
            if ((a > 0) &&(this.mineMap[a - 1][b] == 9)) {
                this.gameMap[a][b]++;
            }
            if (((a < this.row-1)&&(b < this.col-1)) &&(this.mineMap[a + 1][b + 1] == 9)) {
                this.gameMap[a][b]++;
            }
            if ((a > 0 && b >0 ) &&(this.mineMap[a - 1][b - 1] == 9)) {
                this.gameMap[a][b]++;
            }
            if (((a < this.row-1) && (b > 0)) &&(this.mineMap[a + 1][b - 1] == 9)) {
                this.gameMap[a][b]++;
            }
            if ((a > 0) && (b < this.col-1) && (this.mineMap[a - 1][b + 1] == 9)) {
                this.gameMap[a][b]++;
            }
            if (this.gameMap[a][b] == 0){
                this.gameMap[a][b] = -1;
            }
        }
    }

    public void play(){   ///// OYUNUN KURULDUĞU ve BİR SONUCA ULAŞANA KADAR DÖNDÜĞÜ KISIM ///////
        int selectRow , selectCol;
        bombLocation();
        print(this.mineMap);
        System.out.println("** Mayın Tarlası Oyunu **");

        while(isContinue) {
            print(this.gameMap);
            System.out.print("Satır seçiniz : ");
            selectRow = inp.nextInt();
            System.out.print("Sütun seçiniz : ");
            selectCol = inp.nextInt();

            if (selectRow >= 0 && selectCol >= 0){
                if(this.gameMap[selectRow][selectCol] == 0){
                    if (this.mineMap[selectRow][selectCol] != 9) {
                        checkBomb(selectRow, selectCol);
                        this.counter++;
                        if (this.counter == (this.row * this.col) - bombPiece) {
                            System.out.println("\n" + "HİÇ MAYIN AÇMADINIZ - KAZANDINIZ !!!");
                            break;
                        }
                    } else {
                        isContinue = false;
                        System.out.println("MAYINI AÇTINIZ - KAYBETTİNİZ !!!");
                    }
                }
            }else {
                System.out.println("!!! GEÇERSİZ KORDİNAT GİRDİNİZ !!!");
                System.out.println();
            }
            System.out.println("|><=><=><=><=><=><=><=><=><=><=><|");
        }
    }
}