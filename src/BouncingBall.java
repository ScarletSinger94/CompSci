import java.awt.*;

/**
 *  The Bouncing Ball Applet
 */
public class BouncingBall
    extends java.applet.Applet implements Runnable {

  protected Color color = Color.blue;
  protected int radius = 20;
  protected int x, y;
  protected int dx = -2, dy = -4;
  protected Image image;
  protected Graphics offscreen;
  protected Dimension d;

  public void init() {
    String att = getParameter("delay");
    if (att != null) {
      delay = Integer.parseInt(att);
    }
    d = getSize();
    x = d.width * 2 / 3;
    y = d.height - radius;
  }

  public void update(Graphics g) {
    // create the off-screen image buffer
    // if it is invoked the first time
    if (image == null) {
    	 image = createImage(d.width, d.height);
      offscreen = image.getGraphics();
    }

    // draw the background
    offscreen.setColor(Color.white);
    offscreen.fillRect(0,0,d.width,d.height);

    // adjust the position of the ball
    // reverse the direction if it touches
    // any of the four sides
    if (x < radius || x > d.width - radius) {
      dx  =  -dx;
    }
    if (y < radius || y > d.height - radius) {
      dy  =  -dy;
    }
    x += dx;
    y += dy;

    // draw the ball
    offscreen.setColor(color);
    offscreen.fillOval(x - radius, y - radius,
		       radius * 2, radius * 2);

    // copy the off-screen image to the screen
    g.drawImage(image, 0, 0, this);
   
  }

  public void paint(Graphics g) {
    update(g);
  }

  // The animation applet idiom
  protected Thread bouncingThread;
  protected int delay = 100;

  public void start() {
    bouncingThread = new Thread(this);
    bouncingThread.start();
  }

  public void stop() {
    bouncingThread = null;
  }

  public void run() {
    while (Thread.currentThread() == bouncingThread) {
      try {
        Thread.currentThread().sleep(delay);
      } catch (InterruptedException  e) {}
      repaint();
    }
  }

}