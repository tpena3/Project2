/*
Team # 3: John Pavelchak, Tanya Pena, Emmanuel Rodriguez
 */

public class Student extends User {
    String Anumber;
    String level;
    String major;
    
    public Student() {
    }
    
    public Student(String f, String l, String p, String a, String lv, String m) {
        super(f, l, p);
        Anumber = a;
        level = lv;
        major = m;
    }
    
    public void setANumber(String a) {
        Anumber = a;
    }
    
    public String getANumber() {
        return Anumber;
    }
}
