package app.applicationtoprofile.model;

import java.util.Date;


public class BlackBox {
    
    private String data;
    private Date created;

    BlackBox(String data) {
        this.data=data;
        this.created=new Date();
    }

    BlackBox() {
        this.created=new Date();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public BlackBox copy(){
        BlackBox copyBlackBox = new BlackBox();
        copyBlackBox.data=this.data;
        copyBlackBox.created=this.created;
        return copyBlackBox;
    }

    @Override
    public String toString() {
        return "BlackBox{" + "data=" + data + ", created=" + created + '}';
    }
    
    
    
}
