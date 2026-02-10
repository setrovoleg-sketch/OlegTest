import java.util.Date;

public class ForrestGump {
    static void main(String[] args) {
        ForrestGump forrest = new ForrestGump();
        forrest.sayHello();
        forrest.CheckDate();
    }
    void sayHello(){
        System.out.println("Say Hello!");
    }
    void CheckDate(){
        Date date = new Date();
        System.out.println(date.toString());
    }

}
