// Nama  : Yasir Mubarok
// Kelas    : TI21E
// Nim      : 20210040069
class Parent {
    public int x = 5;
}
class Child extends Parent {
    public int x =10;
    public void Info(int x) {
        System.out.println("Nilai x sebagai parameter = " + x);
        System.out.println("Data member x di class Child = " + this.x);
        System.out.println("Data member x di class Parent = " + super.x);
 }
}
public class Percobaan1 {
    public static void main(String args[]) {
        Child tes = new Child();
        tes.Info(20);
 }
}