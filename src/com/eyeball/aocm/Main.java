package com.eyeball.aocm;

import com.eyeball.aocm.api.Resistor;
import com.eyeball.aocm.api.ResistorBand;
import com.eyeball.aocm.api.ResistorBandTolerance;
import com.eyeball.aocm.component.ACOMFrame;

public class Main {

    public static void main(String[] args) {
        System.out.println("AOCM Started.");
        Resistor resistor = new Resistor();
        resistor.addPlaceBand(new ResistorBand(ResistorBand.Colours.BLUE));
        resistor.addPlaceBand(new ResistorBand(ResistorBand.Colours.WHITE));
        resistor.setPowerBand(new ResistorBand(ResistorBand.Colours.WHITE));
        resistor.setToleranceBand(new ResistorBandTolerance(ResistorBandTolerance.Colours.GOLD));
        System.out.println(resistor.calculateResistance());
        ACOMFrame frame = new ACOMFrame();
        frame.pack();
        frame.setVisible(true);
    }

}
