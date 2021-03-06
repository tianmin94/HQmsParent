package com.hand.spc.repository.dto;

import java.util.List;

public class CountOocVO {
    private List<CountOocR> countOocList;
    private List<MessageR> messageList;
    private List<MessageDetailR> messageDetailList;
    private List<MessageUploadRelR> messageUploadRelList;//消息命令集合

    public List<CountOocR> getCountOocList() {
        return countOocList;
    }

    public void setCountOocList(List<CountOocR> countOocList) {
        this.countOocList = countOocList;
    }

    public List<MessageR> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<MessageR> messageList) {
        this.messageList = messageList;
    }

    public List<MessageDetailR> getMessageDetailList() {
        return messageDetailList;
    }

    public void setMessageDetailList(List<MessageDetailR> messageDetailList) {
        this.messageDetailList = messageDetailList;
    }

    public List<MessageUploadRelR> getMessageUploadRelList() {
        return messageUploadRelList;
    }

    public void setMessageUploadRelList(List<MessageUploadRelR> messageUploadRelList) {
        this.messageUploadRelList = messageUploadRelList;
    }
}
