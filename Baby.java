// Nama  : Yasir Mubarok
// Kelas    : TI21E
// Nim      : 20210040069
public class Baby extends Parent{
    String babyName;

    public String getBabyName() {
        return babyName;
    }
    Baby(String babyName){
        super();
        this.babyName = babyName;
        System.out.println("Konstruktor Baby");
        System.out.println(babyName);
 } 
    public void cry() {
        System.out.println("owek owek");
    }
}