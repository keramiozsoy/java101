package examples;

public class ConcurrencySignalMessage {
    private String msg;

    public ConcurrencySignalMessage(String str){
        this.msg=str;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String str) {
        this.msg=str;
    }

}
