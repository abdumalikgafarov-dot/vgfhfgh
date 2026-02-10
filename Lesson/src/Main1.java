import javax.swing.*;
import java.awt.*;

public class Main1 extends JPanel {

    int[][] vertices = {
            {100, 100}, // V1
            {200, 100}, // V2
            {200, 200}, // V3
            {100, 200}  // V4
    };

    String[] labels = {"V1","V2","V3","V4"};

    // G1: 2 - кратное ребро, 1 - обычное ребро или петля
    int[][] adjG1 = {
            {0, 2, 0, 1},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 1}
    };

    // G2: 1 - обычное ребро, 2 - кратное или петля
    int[][] adjG2 = {
            {0, 0, 0, 0},
            {0, 0, 1, 1},
            {0, 0, 1, 1},
            {0, 0, 0, 0}
    };

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));

        drawGraph(g2, adjG1, 50); // G1 слева
        drawGraph(g2, adjG2, 300); // G2 справа
    }

    private void drawGraph(Graphics2D g2, int[][] adj, int xOffset) {
        g2.setColor(Color.BLUE);

        // рисуем рёбра
        for (int i = 0; i < adj.length; i++) {
            for (int j = 0; j < adj.length; j++) {
                if (adj[i][j] > 0) {
                    if (i == j) { // петля
                        g2.drawOval(vertices[i][0]-10+xOffset, vertices[i][1]-30, 20, 20);
                    } else {
                        drawArrow(g2, vertices[i][0]+xOffset, vertices[i][1], vertices[j][0]+xOffset, vertices[j][1]);
                    }
                }
            }
        }

        // рисуем вершины
        g2.setColor(Color.BLACK);
        for (int i = 0; i < vertices.length; i++) {
            g2.fillOval(vertices[i][0]-15+xOffset, vertices[i][1]-15, 30, 30);
            g2.setColor(Color.WHITE);
            g2.drawString(labels[i], vertices[i][0]-7+xOffset, vertices[i][1]+5);
            g2.setColor(Color.BLACK);
        }
    }

    private void drawArrow(Graphics2D g2, int x1, int y1, int x2, int y2) {
        g2.drawLine(x1, y1, x2, y2);
        double phi = Math.toRadians(20);
        int barb = 10;
        double dy = y2 - y1;
        double dx = x2 - x1;
        double theta = Math.atan2(dy, dx);
        double x, y;
        x = x2 - barb * Math.cos(theta + phi);
        y = y2 - barb * Math.sin(theta + phi);
        g2.drawLine(x2, y2, (int)x, (int)y);
        x = x2 - barb * Math.cos(theta - phi);
        y = y2 - barb * Math.sin(theta - phi);
        g2.drawLine(x2, y2, (int)x, (int)y);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Рисованные графы");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.add(new Main1());
        frame.setVisible(true);
    }
}
