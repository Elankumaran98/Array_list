package Exam.com;
import java.util.ArrayList;

public class Channel {
    ArrayList<Subscriber> list=new ArrayList<>();
    public String title;
    public void Subscribe(Subscriber subscriber){
        list.add(subscriber);
    }
    public void UnSubscribe(Subscriber subscriber){
        list.remove(subscriber);
    }
    public void Notification(){
        for(Subscriber subscriber:list)
            subscriber.update();
    }
    public void Upload(String title){
        this.title=title;
        Notification();
    }
}
