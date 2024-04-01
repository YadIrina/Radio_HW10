package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(4);

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToMaxRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToMinRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(4);
        radio.setToMinRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(15);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-15);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetRadioStationBelowMin1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationAboveMin1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationBelowMax1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetRadioStationAboveMax1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(4);

        int expected = 4;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseRadioVolume1() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(4);
        radio.increaseVolume();

        int expected = 5;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseRadioVolume1() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(4);
        radio.decreaseVolume();

        int expected = 3;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotDecreaseRadioVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(-1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotIncreaseRadioVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(101);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetRadioVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetRadioVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(101);

        int expected = 100;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

}
