//Driver class
import java.util.Scanner;

    public class guru1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("NAMA : ");
        String nama = in.nextLine();
        System.out.println("MAPEL : ");
        String mapel = in.nextLine();
        System.out.println("ALAMAT : ");
        String alamat = in.nextLine();
        System.out.println("ID : ");
        int id = in.nextInt();
        // membuat obyek
        Guru bupasha = new Guru();
        Guru bujevi = new Guru();
        Guru pakdiaur = new Guru();
        Guru buaulia = new Guru();
        Guru bufirda = new Guru();

        bupasha.id = 1;
        bupasha.nama = "Bu Pashatania";
        bupasha.mapel = "produktif";
        bupasha.alamat = "malang";
        
        System.out.println("Ini data Bu Pasha");
        System.out.println(bupasha.id);
        System.out.println(bupasha.nama);
        System.out.println(bupasha.mapel);
        System.out.println(bupasha.alamat);

        bujevi.id = 21;
        bujevi.nama = "Bu jevi";
        bujevi.mapel = "Bahasa Inggris";
        bujevi.alamat = "Surabaya";

        System.out.println("data bu jevi");
        System.out.println(bujevi.id);
        System.out.println(bujevi.nama);
        System.out.println(bujevi.mapel);
        System.out.println(bujevi.alamat);
        
        
        pakdiaur.id = 22;
        pakdiaur.nama= "pak diauraja";
        pakdiaur.mapel= "fisika";
        pakdiaur.alamat= "mojokerto";

        System.out.println("data pak diaur");
        System.out.println(pakdiaur.id);
        System.out.println(pakdiaur.nama);
        System.out.println(pakdiaur.mapel);
        System.out.println(pakdiaur.alamat);

    
        buaulia.id = 23;
        buaulia.nama= "Bu aulia";
        buaulia.mapel= "produktif";
        buaulia.alamat= "malang sawojajar";

        System.out.println("data bu aulia");
        System.out.println(buaulia.id);
        System.out.println(buaulia.nama);
        System.out.println(buaulia.mapel);
        System.out.println(buaulia.alamat);


        bufirda.id = 24;
        bufirda.nama= "Bu Firdausa";
        bufirda.mapel= "Dasar Program Keahlian";
        bufirda.alamat= "jakarta";

        System.out.println("data bu Firda");
        System.out.println(bufirda.id);
        System.out.println(bufirda.nama);
        System.out.println(bufirda.mapel);
        System.out.println(bufirda.alamat);

        buaulia.print();
        bufirda.print();
        bujevi.print();
        bupasha.print();
        pakdiaur.print();
    

        
        
    
    }
}
