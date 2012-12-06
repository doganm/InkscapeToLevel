 package sinyalprojesi;
      
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
 import javax.swing.JSlider; 

public class Slider extends JPanel {
    
    protected JSlider fazSlider = new JSlider(JSlider.VERTICAL,  -300,1720,  0);
    protected JSlider acıSlider = new JSlider(JSlider.VERTICAL,    0, 1800, 0);
    protected JSlider genlikSlider = new JSlider(JSlider.VERTICAL,  0,300, 0);
    protected JSlider genislikSlider=new JSlider(JSlider.VERTICAL,  0, 1000,  0);
    protected JSlider yükseklikSlider=new JSlider(JSlider.VERTICAL,   -100, 220, 140);
    protected JSlider fazAcısıSlider=new JSlider(JSlider.VERTICAL,0,360,0);
    protected JLabel yükseklikLabel=new JLabel("                  YÜKSEKLİK KONUMU");
    protected JLabel genislikLabel=new JLabel("                 GENISLIK");
    protected JLabel genlikLabel = new JLabel("                 GENLIK");
    protected JLabel acıLabel = new JLabel("                  PERIYOT DEGERI");
    protected JLabel fazLabel = new JLabel("                       FAZ");
    protected JLabel fazAcısıLabel=new JLabel("             FAZACISI");
    protected JPanel panelSlider=new JPanel();
    
    public Slider()   {
        panelSlider.setLayout(new GridLayout(2,6));
        setLayout(new FlowLayout());
        add(panelSlider);
        panelSlider.add(fazSlider);
        panelSlider.add(acıSlider);
        panelSlider.add(genlikSlider);
        panelSlider.add(genislikSlider);
        panelSlider.add(yükseklikSlider);
        panelSlider.add(fazAcısıSlider);
        panelSlider.add(fazLabel);
        panelSlider.add(acıLabel);
        panelSlider.add(genlikLabel);
        panelSlider.add(genislikLabel);
        panelSlider.add(yükseklikLabel);
        panelSlider.add(fazAcısıLabel);
    }
}
    
 
