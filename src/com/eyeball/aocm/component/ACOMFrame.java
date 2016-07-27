package com.eyeball.aocm.component;

import com.eyeball.aocm.api.Resistor;

import javax.swing.*;

public class ACOMFrame extends JFrame {

    private Resistor resistor = new Resistor();

    public ACOMFrame() {
        setTitle("Automatic Octo Computing Machine");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(ACOMFrame.class.getResource("/Chicken-32.png")).getImage());
    }

    public Resistor getResistor() {
        return resistor;
    }
}

