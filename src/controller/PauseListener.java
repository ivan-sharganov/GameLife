package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PauseListener implements ActionListener {
    public  boolean pause;
    public PauseListener() {
        pause=false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pause=!pause;
        // TODO 21: добавить возможность ставить игру на паузу
        System.out.println("нажали паузу");
    }
}
