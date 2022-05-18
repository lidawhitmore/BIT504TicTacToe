import javax.swing.JFrame;

public class TicTacToe extends JFrame{

	//Constants for main window
		public static final String TITLE = "Tic-Tac-Toe";

	public TicTacToe() {
    	setTitle(TITLE);
    	setSize(GamePanel.CANVAS_WIDTH, GamePanel.CANVAS_HEIGHT);
    	add(new GamePanel());
    	
    	//pack();             
		setLocationRelativeTo(null);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
					new TicTacToe();
			}
		});
	}

}
