
import java.util.Scanner;


public class testguru {
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

        guru pasha = new guru();
        guru munif = new guru();
        guru aulia = new guru();
        guru feni = new guru();
        guru abidin = new guru();

        //Bu Pasha
        pasha.id = 25;
        pasha.nama = "Pashatania Fitri Indah Lestari, S.Kom";
        pasha.mapel ="Produktif RPL";
        pasha.alamat = "Malang";

        //Pak Munif
        munif.id = 32;
        munif.nama = "Mohammad Munif, S.Pd";
        munif.mapel = "PAI";
        munif.alamat = "Malang";

        //Bu Aulia
        aulia.id = 22;
        aulia.nama = "Aulia Mas'adah, S.Kom";
        aulia.mapel = "Produktif RPL";
        aulia.alamat = "Malang";

        //Bu Feni
        feni.id = 23;
        feni.nama = "Feniliya Mayrini";
        feni.mapel = "Matematika";
        feni.alamat = "Malang";

        //Pak Abidin
        abidin.id = 31;
        abidin.nama = "Achmad Abidin, M.Pd";
        abidin.mapel = "Matematika";
        abidin.alamat = "Malang";

        System.out.println("Data dari Bu Pasha: ");
        System.out.println("Id: "+pasha.id);
        System.out.println("Nama: "+pasha.nama);
        System.out.println("Mapel: "+pasha.mapel);
        System.out.println("Alamat "+pasha.alamat);
        System.out.println("Data dari Pak Munif:  ");
        System.out.println("Id: "+munif.id);
        System.out.println("Nama: "+munif.nama);
        System.out.println("Mapel: "+munif.mapel);
        System.out.println("Alamat: "+munif.alamat);
        System.out.println("Data dari Bu Aulia:  ");
        System.out.println("Id: "+aulia.id);
        System.out.println("Nama: "+aulia.nama);
        System.out.println("Mapel: "+aulia.mapel);
        System.out.println("Alamat: "+aulia.alamat);
        System.out.println("Data dari Bu Feni:  ");
        System.out.println("Id: "+feni.id);
        System.out.println("Nama: "+feni.nama);
        System.out.println("Mapel: "+feni.mapel);
        System.out.println("Alamat: "+feni.alamat);
        System.out.println("Data dari Pak Abidin");
        System.out.println("Id: "+abidin.id);
        System.out.println("Nama: "+abidin.nama);
        System.out.println("Mapel: "+abidin.mapel);
        System.out.println("Alamat: "+abidin.alamat);



    

    }

    
}
