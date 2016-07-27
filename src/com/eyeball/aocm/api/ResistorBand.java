package com.eyeball.aocm.api;

public class ResistorBand {

    Colours colour;

    public ResistorBand(Colours colour) {
        this.colour = colour;
    }

    public enum Colours {
        BLACK(0),
        BROWN(1),
        RED(2),
        ORANGE(3),
        YELLOW(4),
        GREEN(5),
        BLUE(6),
        VIOLET(7),
        GREY(8),
        WHITE(9);

        int value;

        Colours(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
