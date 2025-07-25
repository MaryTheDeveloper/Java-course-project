package ru.innopolis.java.second;

public class Televizor {
    private String status;
    private int channelNumber;

    public Televizor(String status, int channelNumber){
        this.status = status;
        this.channelNumber = channelNumber;
    }

    public void setStatus (String status){
            this.status = status;
    }

    public String getStatus(){
        return this.status;
    }

    public void setChannelNumber(int channelNumber){
        this.channelNumber = channelNumber;
    }

    public int getChannelNumber(){
        return this.channelNumber;
    }
}
