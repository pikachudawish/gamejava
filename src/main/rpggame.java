import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class rpggame extends Canvas implements Runnable {
    private boolean running = false;

    public void start() {
        running = true;
        new Thread(this).start();
    }

    public void run() {
        while (running) {
            update();
            render();

            try { Thread.sleep(16); } catch (InterruptedException ignored) {}
        }
    }

    private void render() {
        BufferStrategy bs = getBufferStrategy();
        if (bs == null) {
            createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();
        g.clearRect(0, 0, 800, 600);

        g.dispose();
        bs.show();
    }

    private void update() {

    }

    public static void main(String[] args) {
        JFrame janela = new JFrame("Meu Jogo Java");
        rpggame game = new rpggame();

        janela.add(game);
        janela.pack();
        janela.setSize(800, 600);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

        game.start();
    }
}