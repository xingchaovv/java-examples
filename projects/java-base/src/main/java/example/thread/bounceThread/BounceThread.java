package example.thread.bounceThread;

import java.awt.*;

import javax.swing.*;

/**
 * Shows animated bouncing balls.
 * @version 1.34 2015-06-21
 * @author Cay Horstmann
 */
public class BounceThread
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         JFrame frame = new BounceFrame();
         frame.setTitle("BounceThread");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}