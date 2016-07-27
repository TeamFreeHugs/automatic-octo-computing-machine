package com.eyeball.aocm.api;

public class ResistorBandTolerance  {

    public enum Colours {
        BROWN(1),
        RED(2),
        GOLD(5),
        SILVER(10);

        int value;

        Colours(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public ResistorBandTolerance(Colours colour) {
    }
}
