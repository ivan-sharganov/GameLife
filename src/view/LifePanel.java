package view;

import model.LifeWorld;

import javax.swing.*;
import java.awt.*;

public class LifePanel extends JPanel {

    LifeWorld world;

    public LifePanel(LifeWorld world) {
        this.world = world;
    }

    int cellSize = 7;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // TODO 11: нарисуйте прямоугольниками одного цвета - живые клетки, а прямоугольниками другого цвета - мертвые
        for (int x = 0; x < world.getWidth(); ++x) {
            for (int y = 0; y < world.getHeight(); y++) {
                if (!world.isAlive(x, y)) {
                    g.setColor(new Color(0x6A0780));
                    g.fillRect(x * cellSize, y * cellSize, cellSize, cellSize);
                    g.setColor(new Color(0x190005));
                    g.drawRect(x * cellSize, y * cellSize, cellSize, cellSize);
                } else {
                    g.setColor(new Color(0x42D572));
                    g.fillRect(x * cellSize, y * cellSize, cellSize, cellSize);
                    g.setColor(new Color(0x190005));
                    g.drawRect(x * cellSize, y * cellSize, cellSize, cellSize);
                }
            }
        }
    }
}