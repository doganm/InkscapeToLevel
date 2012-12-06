package sinyalprojesi;
//Swing componentleri kendi yazıo graphicsi awt den alıo
//applet componenti ve graphicsi awtden kullssdsdsdanıorzsa
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

public class CanvasPanel extends JPanel {

    protected int yükseklik;
    protected int genlik;
    protected int genislik;
    protected int acısalFrakans;
    protected int fazAcısı;
    protected int faz;//başlangıç noktasını değiştiriyor
    int points;
    double[] sines;
    int[] pts;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        points = acısalFrakans * 2;
        sines = new double[points];

        for (int i = 0; i < points; i++) {
            double radians = (Math.PI / 180) * i;
            sines[i] = Math.sin(radians+fazAcısı*Math.PI/180);
        }

        int maxWidth = genislik;
        double hstep = (double) maxWidth / (double) points;
        pts = new int[points];
        for (int i = 0; i < points; i++) {
            pts[i] = (int) (sines[i] * genlik);
        }
        g.setColor(Color.BLUE);
        g.drawLine(0, 140, 1000, 140);
      
        g.setColor(Color.red);

        for (int i = 1; i < points; i++) {

            int x1 = (int) ((i - 1) * hstep);
            int x2 = (int) (i * hstep);
            int y1 = pts[i - 1] + yükseklik;
            int y2 = pts[i] + yükseklik;
            g.drawLine(x1 + faz, y1, x2 + faz, y2);
        }
    }
}
