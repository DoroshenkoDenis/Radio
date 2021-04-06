package ru.doroshenko;

public class Radio {
    private int firstChannel;
    private int finalChannel;
    private int minVolume;
    private int maxVolume;
    private int currentChannel;
    private int currentVolume;


    public Radio(int firstChannel, int finalChannel, int minVolume, int maxVolume, int currentChannel, int currentVolume) {
        this.finalChannel = finalChannel;
        this.firstChannel = firstChannel;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
        this.currentChannel = currentChannel;
    }


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

    public int getCurrentVolume() {
        return currentVolume;
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

    // определяет канал в установленном диапазоне
    public void addCurrentChannel() {
        if (currentChannel > finalChannel) {
            this.currentChannel = firstChannel;
            return;
        }
        if (currentChannel < firstChannel) {
            this.currentChannel = finalChannel;

        }
    }

    // определяет громкость в установленном диапазоне
    public void addCurrentVolume() {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;

        }
    }
}