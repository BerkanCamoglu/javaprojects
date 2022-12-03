import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

class Sayfa extends JPanel implements ActionListener {

    private final int DELAY = 1500;
    private Timer timer;

    public Sayfa() {

        initTimer();
    }

    private void initTimer() {

        timer = new Timer(DELAY, this);
        timer.start();
    }

    public Timer getTimer() {

        return timer;
    }

    private void doDrawing(Graphics g) {
        int w = getWidth();
        int h = getHeight();

        Graphics2D g2d = (Graphics2D) g.create();

        float[] dash1 = {2f, 0f, 2f};
        float[] dash2 = {1f, 1f, 1f};
        float[] dash3 = {4f, 0f, 2f};
        float[] dash4 = {4f, 4f, 1f};

        BasicStroke bs1 = new BasicStroke(1, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_ROUND, 1.0f, dash1, 2f);

        BasicStroke bs2 = new BasicStroke(1, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_ROUND, 1.0f, dash2, 2f);

        BasicStroke bs3 = new BasicStroke(1, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_ROUND, 1.0f, dash3, 2f);

        BasicStroke bs4 = new BasicStroke(1, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_ROUND, 1.0f, dash4, 2f);
        BasicStroke bs5;

        List<BasicStroke> basicStrokes = new ArrayList<>();
        basicStrokes.add(bs1);
        basicStrokes.add(bs2);
        basicStrokes.add(bs3);
        basicStrokes.add(bs4);


     //   BasicStroke[] basicStrokes = new BasicStroke[]{bs1,bs2,bs3,bs4,bs5};
        Random r = new Random();

        for (int i = 0; i < 5; i++) {
            int randomKalınlık = r.nextInt(10);
            bs5 = new BasicStroke(randomKalınlık, BasicStroke.CAP_BUTT,
                    BasicStroke.JOIN_BEVEL);
            basicStrokes.add(bs5);
            int randomStroke = r.nextInt(5);
            g2d.setStroke(basicStrokes.get(randomStroke));
            float m = r.nextFloat();
            float n = r.nextFloat();
            float b = r.nextFloat();
            int x1 = r.nextInt(350) ;
            int x2 = r.nextInt(350) ;
            int y1 = r.nextInt(250) ;
            int y2 = r.nextInt(250) ;
            g2d.setColor(new Color(m,n,b));
            g2d.drawLine(x1, y1, x2, y2);
        }
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}

public class Defter extends JFrame {

    public Defter() {

        initUI();
    }

    private void initUI() {

        final Sayfa sayfa = new Sayfa();
        add(sayfa);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Timer timer = sayfa.getTimer();
                timer.stop();
            }
        });

        setTitle("Random_Lines");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                Defter defter = new Defter();
                defter.setVisible(true);
            }
        });
    }
}