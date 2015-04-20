/*
Team # 3: John Pavelchak, Tanya Pena, Emmanuel Rodriguez
 */

public class User {
    String first;
    String last;
    String password;
    
    public User() {
    }
    
    public User(String f, String l, String p) {
        first = f;
        last = l;
        password = p;
    }
    
    public void setFirst(String f) {
        first = f;
    }
    
    public String getFirst() {
        return first;
    }
    
    public void setLast(String l) {
        last = l;
    }
    
    public String getLast() {
        return last;
    }
    
    public void setPassword(String p) {
        password = p;
    }
    
    public String getPassword() {
        return password;
    }
}
