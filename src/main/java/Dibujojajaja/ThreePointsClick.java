/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dibujojajaja;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author usuario
 */
public class ThreePointsClick extends JPanel implements MouseListener {
    int[] xPoints = new int[3];
    int[] yPoints = new int[3];
    int pointCount = 0;

    public ThreePointsClick() {
        addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        for (int i = 0; i < pointCount; i++) {
            g.fillOval(xPoints[i], yPoints[i], 10, 10);
        }
        if (pointCount == 3) {
            g.drawLine(xPoints[0] + 5, yPoints[0] + 5, xPoints[1] + 5, yPoints[1] + 5);
            g.drawLine(xPoints[1] + 5, yPoints[1] + 5, xPoints[2] + 5, yPoints[2] + 5);
            g.drawLine(xPoints[2] + 5, yPoints[2] + 5, xPoints[0] + 5, yPoints[0] + 5);
        }
    }

    public void mousePressed(MouseEvent e) {
        if (pointCount < 3) {
            xPoints[pointCount] = e.getX();
            yPoints[pointCount] = e.getY();
            pointCount++;
            repaint();
        }
    }

    public void mouseReleased(MouseEvent e) { }
    public void mouseClicked(MouseEvent e) { }
    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Three Points Click");
        
    frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ThreePointsClick());
        frame.setVisible(true);
    }
}
