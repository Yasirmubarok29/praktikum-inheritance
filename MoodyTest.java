// Nama  : Yasir Mubarok
// Kelas    : TI21E
// Nim      : 20210040069
public class MoodyTest {
    public static void main(String[] args) {
        MoodyObject m = new MoodyObject();
        SadObject Sad = new SadObject();
        HappyObject Happy = new HappyObject();
        
        m.speak();
        Sad.cry();
        Happy.laugh();
    }
}