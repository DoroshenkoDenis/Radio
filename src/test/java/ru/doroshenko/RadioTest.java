package ru.doroshenko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    void setFinalChannel() {
        Radio radio = new Radio(0, 77, 66, 0, 100, 50);
        assertEquals(77, radio.getFinalChannel());
    }

    @Test
    void setCurrentChannel() {
        Radio radio = new Radio(0, 99, 66, 0, 100, 50);
        radio.addCurrentChannel();
        assertEquals(66, radio.getCurrentChannel());
    }

    @Test
    void setCurrentChannelOverFinal() {
        Radio radio = new Radio(0, 99, 100, 0, 100, 50);
        radio.addCurrentChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void setCurrentChannelLessFirst() {
        Radio radio = new Radio(0, 99, -100, 0, 100, 50);
        radio.addCurrentChannel();
        assertEquals(99, radio.getCurrentChannel());
    }

    @Test
    void switchChannelUpOverFinal() {
        Radio radio = new Radio(0, 99, 99, 0, 100, 50);
        radio.switchChannelUp();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void switchChannelDownLessFirst() {
        Radio radio = new Radio(0, 99, 0, 0, 100, 50);
        radio.switchChannelDown();
        assertEquals(99, radio.getCurrentChannel());
    }

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio(0, 99, 0, 0, 100, 50);
        radio.addCurrentVolume();
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeOverMax() {
        Radio radio = new Radio(0, 99, 0, 0, 100, 150);
        radio.addCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeLessMin() {
        Radio radio = new Radio(0, 99, 0, 0, 100, -500);
        radio.addCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio(0, 99, 0, 0, 100, 50);
        radio.increaseVolume();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeOverMax() {
        Radio radio = new Radio(0, 99, 0, 0, 100, 100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio(0, 99, 0, 0, 100, 50);
        radio.decreaseVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeLessMin() {
        Radio radio = new Radio(0, 99, 0, 0, 100, 0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void switchChannelUp() {
        Radio radio = new Radio(0, 99, 66, 0, 100, 50);
        radio.switchChannelUp();
        assertEquals(67, radio.getCurrentChannel());
    }


    @Test
    void switchChannelDown() {
        Radio radio = new Radio(0, 99, 77, 0, 100, 50);
        radio.switchChannelDown();
        assertEquals(76, radio.getCurrentChannel());
    }
}