package ru.doroshenko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void setCurrentChannel() {
        radio.setCurrentChannel(5);
        assertEquals(5, radio.getCurrentChannel());
    }

    @Test
    void setCurrentChannelOverFinal() {
        radio.setCurrentChannel(15);
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    void setCurrentChannelLessFirst() {
        radio.setCurrentChannel(-5);
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void setCurrentVolume() {
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeOverMax() {
        radio.setCurrentVolume(15);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeLessMin() {
        radio.setCurrentVolume(-5);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void increaseVolume() {
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeOverMax() {
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolume() {
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }
@Test
    void decreaseVolumeLessMin() {
        radio.setCurrentVolume(radio.getMinVolume());
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void switchChannelUp() {
        radio.setCurrentChannel(5);
        radio.switchChannelUp();
        assertEquals(6, radio.getCurrentChannel());
    }

    @Test
    void switchChannelUpOverFinal() {
        radio.setCurrentChannel(radio.getFinalChannel());
        radio.switchChannelUp();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void switchChannelDown() {
        radio.setCurrentChannel(5);
        radio.switchChannelDown();
        assertEquals(4, radio.getCurrentChannel());
    }

    @Test
    void switchChannelDownLessFirst() {
        radio.setCurrentChannel(radio.getFirstChannel());
        radio.switchChannelDown();
        assertEquals(9, radio.getCurrentChannel());
    }
}