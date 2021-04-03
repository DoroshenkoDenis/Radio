package ru.doroshenko;

public class Radio {
    private int firstChannel = 0;
    private int finalChannel = 9;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentChannel;
    private int currentVolume;

    public int getFirstChannel() {
        return firstChannel;
    }

    public void setFirstChannel(int firstChannel) {
        this.firstChannel = firstChannel;
    }

    public int getFinalChannel() {
        return finalChannel;
    }

    public void setFinalChannel(int finalChannel) {
        this.finalChannel = finalChannel;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > finalChannel) {
            this.currentChannel = finalChannel;
            return;
        }
        if (currentChannel < firstChannel) {
            this.currentChannel = firstChannel;
            return;
        }
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume){
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume){
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }

    public void switchChannelUp() {
        if (currentChannel == finalChannel) {
            this.currentChannel = firstChannel;
            return;
        }
        currentChannel++;
    }

    public void switchChannelDown() {
        if (currentChannel == firstChannel) {
            this.currentChannel = finalChannel;
            return;
        }
        currentChannel--;
    }
}
