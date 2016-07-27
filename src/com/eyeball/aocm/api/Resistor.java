package com.eyeball.aocm.api;

import java.util.ArrayList;

public class Resistor {

     private ArrayList<ResistorBand> placesBands = new ArrayList<>();
     private ResistorBand powerBand = new ResistorBand(ResistorBand.Colours.BLACK);
     private ResistorBandTolerance toleranceBand = new ResistorBandTolerance(ResistorBandTolerance.Colours.GOLD);

    public void addPlaceBand(ResistorBand band) {
        placesBands.add(band);
    }

    public void setPlacesBandByID(int id, ResistorBand band) {
        placesBands.set(id, band);
    }

    public void setPowerBand(ResistorBand powerBand) {
        this.powerBand = powerBand;
    }

    public ResistorBand getPowerBand() {
        return powerBand;
    }

    public void setToleranceBand(ResistorBandTolerance toleranceBand) {
        this.toleranceBand = toleranceBand;
    }

    public ResistorBandTolerance getToleranceBand() {
        return toleranceBand;
    }

    public int getNumberOfPlaces() {
        return placesBands.size();
    }

    public long calculateResistance() {
        String raw = "";
        if (getNumberOfPlaces() == 0) return 0;
        for (ResistorBand band : placesBands) {
            raw += band.colour.getValue();
        }
        long rawNumber = Long.parseLong(raw);
        System.out.println(rawNumber);
        int power = (int) Math.pow(10, powerBand.colour.getValue());
        System.out.println(power);
        return rawNumber * power;
    }

}
