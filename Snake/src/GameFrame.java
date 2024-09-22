import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	GameFrame() {
		
//		GamePanel panel = new GamePanel();
//		this.add(panel);
//		
//		Instead of the above code you can write:
		
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);		//to get the window in middle
		
		
	}
}
