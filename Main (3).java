/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tam adınızı daxil edin: ");
        String ad = scan.nextLine();
        System.out.println("Id ni daxil edin: ");
        String id = scan.nextLine();
        if(id.startsWith("-")){
            throw new IllegalArgumentException("ID mənfi ola bilməz");
        }
        System.out.println("Imtahanların sayını daxil edin: ");
        int s = scan.nextInt();
        if(s < 0){
            throw new IllegalArgumentException("Imtahan sayı mənfi ola bilməz");
        }
        System.out.println("Imtahanda aldığınız qiymətləri daxil edin: ");

        double cəm = 0;
        double say = 0;
        for(int i = 0; i < s; i++){
            say++;
            double d = scan.nextDouble();
            if(d < 0 || d > 100){
                throw new IllegalArgumentException("İmtahan balı 100-dən çox və ya 0 dan az ola bilməz!!!");
            }
            cəm += d;
            if(d < 51.0) { System.out.println("Siz " + (int)(say) + "-cı kursdan kəsildiniz. Çünki siz " + d + " qiyməti aldınız.");}continue;
        }


        double ortalama = cəm / say;
        System.out.println("Sizin ortalamanız: " + ortalama);

        if(ortalama <= 100.0 && ortalama >= 91.0){
            System.out.println("Sizin ortalama qiymətiniz A-dır");
        }else if(ortalama < 91.0 && ortalama >= 81.0){
            System.out.println("Sizin ortalama qiymətiniz B-dır");
        }else if(ortalama < 81.0 && ortalama >= 71.0){
            System.out.println("Sizin ortalama qiymətiniz C-dır");
        }else if(ortalama < 71.0 && ortalama >= 61.0){
            System.out.println("Sizin ortalama qiymətiniz D-dır");
        }else if(ortalama < 61.0 && ortalama >= 51.0){
            System.out.println("Sizin ortalama qiymətiniz E-dır");
        }else{
            System.out.println("Təəssüflər olsun ki, siz kursu keçə bilmədiniz");
        }

        Tələbə t1 = new Tələbə(ad, id, ortalama);
        System.out.println(t1.toString());
    }

    public static class Tələbə {
        private String TamAd;
        private String ID;
        private double Ortalama;

        public Tələbə(String TamAd, String İD, double Ortalama){
            this.TamAd = TamAd;
            this.ID = İD;
            this.Ortalama = Ortalama;
        }


        public String getTamAd() {
            return TamAd;
        }

        public void setTamAd(String tamAd) {
            TamAd = tamAd;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public double getOrtalama() {
            return Ortalama;
        }

        public void setOrtalama(double ortalama) {
            Ortalama = ortalama;
        }

        public String toString(){
            return "Tələbə : " + this.TamAd + " ID: " + this.ID + " Ortalama: " + this.Ortalama;
        }
    }

}