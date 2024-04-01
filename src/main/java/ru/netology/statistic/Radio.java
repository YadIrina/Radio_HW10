package ru.netology.statistic;

public class Radio {
    private int currentRadioStation;
    private int currentRadioVolume;

    public void next() {
        if (currentRadioStation != 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            setCurrentRadioStation(0);
            return;
        }
        if (newCurrentRadioStation > 9) {
            setCurrentRadioStation(9);
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    public void setCurrentRadioVolume(int newCurrentRadioVolume) {
        if (newCurrentRadioVolume < 0) {
            setCurrentRadioVolume(0);
            return;
        }
        if (newCurrentRadioVolume > 100) {
            setCurrentRadioVolume(100);
            return;
        }
        currentRadioVolume = newCurrentRadioVolume;
    }

    public void setToMinRadioStation() {
        currentRadioStation = 0;
    }

    public void increaseVolume() {
        int nextRadioVolume = currentRadioVolume + 1;
        if (currentRadioVolume == 100) {
            setCurrentRadioVolume(100);
        }

        if (currentRadioVolume < 100) {
            setCurrentRadioVolume(nextRadioVolume);
        }
        return;
    }

    public void decreaseVolume() {
        int prevRadioVolume = currentRadioVolume - 1;
        if (currentRadioVolume <= 0) {
            setCurrentRadioVolume(0);
        }

        if (currentRadioVolume > 0) {
            setCurrentRadioVolume(prevRadioVolume);
        }
        return;
    }

}
