public class HelloWorld {

    String message = "Hello World!";
    String other;

    public HelloWorld(String other) {
        this.other = other;
    }

    public void setOther(String otherMessage){
        this.other = otherMessage;
    }
    public void getOther(){
        System.out.println(other);
    }
}
