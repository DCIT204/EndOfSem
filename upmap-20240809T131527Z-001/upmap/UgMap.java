package com.Group_13.upmap;

import java.awt.*;

public class UgMap extends Canvas {

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.CYAN);
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("NASA:/Users/Phinehasfreeman/Desktop/Group_41/src/com/Group_41/com/upmap/Group_41_map.png");
        g.drawImage(i, 10,10,this);
    }
}
