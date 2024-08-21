//Object Class
public class guru {
    int id;
    String nama;
    String mapel;
    String alamat;


    //constructor nama sama dengan class
    public guru() {
        id = 0;
        nama = "";
        mapel = "";
        alamat = "";
    } 
    //Constructor parameter
    public guru(int id, String nama, String mapel, String alamat){
        this.id = id;
        this.nama = nama;
        this.mapel = mapel;
        this.alamat = alamat;
    }

    //Metdhod
    public void print () {
        System.out.println("-----------------------------");
        System.out.println("ID : "+id);
        System.out.println("Nama: "+nama);
        System.out.println("Mapel: "+mapel);
        System.out.println("alamat: "+alamat);
        System.out.println("-----------------------------");
    }





    
}