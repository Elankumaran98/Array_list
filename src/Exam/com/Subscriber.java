package Exam.com;

public class Subscriber {
    private String name;
    private Channel channel=new Channel();
    public Subscriber(String name){
        super();
        this.name=name;
    }
    public void update(){
        System.out.println("Hey "+name+" Video Uploaded :"+channel.title);
    }
    public void SubscribeChannel(Channel channel){
        this.channel=channel;
    }
    public void UnsubscribeChannel(Channel channel){
        this.channel=channel;
    }
}
