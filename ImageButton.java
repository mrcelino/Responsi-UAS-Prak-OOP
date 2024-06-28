package tes;

import javax.swing.*;
import java.awt.*;

// Custom JButton with background image
class ImageButton extends JButton {
    private Image backgroundImage;

    public ImageButton(Image image) {
        this.backgroundImage = image;
        setBorderPainted(false);
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}