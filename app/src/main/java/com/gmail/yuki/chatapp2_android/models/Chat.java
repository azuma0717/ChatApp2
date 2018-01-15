package com.gmail.yuki.chatapp2_android.models;

/**
 * Created by yuki on 2018/01/13.
 */

public class Chat  {
    public String sender;
    public String receiver;
    public String senderUid;
    public String receiverUid;
    public String message;
    public long timestamp;

    public Chat(){

    }

    public Chat(String sender, String receiver, String senderUid, String receiverUid, String message, long timestamp){
        this.sender = sender;
        this.receiver = receiver;
        this.senderUid = senderUid;
        this.receiverUid = receiverUid;
        this.message = message;
        this.timestamp = timestamp;

    }

}