package com.gmail.yuki.chatapp2_android.core.chat;


import android.content.Context;

import com.gmail.yuki.chatapp2_android.models.Chat;

/**
 * Created by yuki on 2018/01/13.
 */

public class ChatPresenter implements ChatContract.Presenter, ChatContract.OnSendMessageListener,
        ChatContract.OnGetMessagesListener {
    private ChatContract.View mView;
    private ChatInteractor mChatInteractor;

    public ChatPresenter(ChatContract.View view) {
        this.mView = view;
        mChatInteractor = new ChatInteractor(this, this);
    }

    @Override
    public void sendMessage(Context context, Chat chat, String receiverFirebaseToken) {
        mChatInteractor.sendMessageToFirebaseUser(context, chat, receiverFirebaseToken);
    }

    @Override
    public void getMessage(String senderUid, String receiverUid) {
        mChatInteractor.getMessageFromFirebaseUser(senderUid, receiverUid);
    }

    @Override
    public void onSendMessageSuccess() {
        mView.onSendMessageSuccess();
    }

    @Override
    public void onSendMessageFailure(String message) {
        mView.onSendMessageFailure(message);
    }

    @Override
    public void onGetMessagesSuccess(Chat chat) {
        mView.onGetMessagesSuccess(chat);
    }

    @Override
    public void onGetMessagesFailure(String message) {
        mView.onGetMessagesFailure(message);
    }
}