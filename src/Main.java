
import java.util.Scanner ;

public class Main {

    public static void main (String[] args){
        Notlar notlar = new Notlar();
        Scanner input = new Scanner(System.in);
        System.out.println("Vize notunu giriniz " + notlar.vize );
        notlar.vize = input.nextInt();
        System.out.println("Final notunu giriniz " + notlar.finall );
        notlar.finall= input.nextInt();
        System.out.println("Quiz notunu giriniz " + notlar.quiz );
        notlar.quiz = input.nextInt();

        notlar.notHesapla();
        System.out.println("Öğrencinin ortalaması: " + notlar.ortalama );
        if (notlar.ortalama < 50 ){
            System.out.println("Ögrenci dersten kaldı ");
        }
        else {
            System.out.println("Öğrenci dersten geçti");
        }











    }
}