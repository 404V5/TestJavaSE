package com.langsin.gui.draw;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.awt.AWTUtilities;

public class Snow {
	
	public static void main(String[] args) throws IOException {
		final Image image = ImageIO.read(new File("snow.png"));
		
		final JFrame jf = new JFrame();
		jf.setAlwaysOnTop(true);
		jf.setSize(800, 600);
		jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
		jf.setUndecorated(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AWTUtilities.setWindowOpaque(jf, false);
		final JPanel pane = new JPanel(){
			int[] snowx = null;
			int[] snowy = null;
			int[] angels = null;
			int count = 50;
			Random r = new Random();
			@Override
			public void paint(Graphics g) {
				Rectangle bounds = jf.getBounds();
				Graphics2D g2 = (Graphics2D) g;
				if(snowx == null){
					snowx = new int[count];
					snowy = new int[count];
					angels = new int[count];
				}
				
				for (int i = 0; i < count; i++) {
					snowx[i] = r.nextInt(bounds.width);
					snowy[i] = r.nextInt(bounds.height);
					angels[i] = r.nextInt(360);
				}
				
				for (int j = 0; j < count; j++) {
					snowx[j]+= r.nextInt(6)-3;
					snowy[j]+= r.nextInt(6)-3;
					angels[j]+=j/5;
					
					int x = snowx[j];
					int y = snowy[j];
					int angel = angels[j];
					
					double radins = Math.toRadians(angel);
					
					g2.translate(x, y);
					g2.rotate(radins);
					g2.drawImage(image, 0, 0, null);
					g2.rotate(-radins);
					g2.translate(-x, -y);
				}
				
				
			}
		};
		
		jf.setContentPane(pane);
		jf.setVisible(true);
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					pane.repaint();
				}
			}
		}).start();
		
	}
	
}
