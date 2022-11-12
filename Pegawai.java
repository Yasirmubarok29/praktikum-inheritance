// Nama  : Yasir Mubarok
// Kelas    : TI21E
// Nim      : 20210040069
public class Pegawai {
    public String nama;
    public double gaji;
}

class Manajer extends Pegawai {
    public String departemen;
    
    public void IsiData(String n, String d){
        nama=n;
        departemen=d;
    }
}