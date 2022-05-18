import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Cell {

	//content of this cell (empty, cross, nought)
		Player content;
		//row and column of this cell
		int row, col;
		
		/** Constructor to initialise this cell with the specified row and col */
		Cell [][] cells;
		public Cell(int row, int col) {
			
			cells = new Cell[row][col];
			     for (int r = 0; r < row; r++)
			     {
			         for (int c = 0; c < col; c++)
			         {
//			             cells[r][c] = ;
			         }
			     }
			 }

			
			//TODO: Initialise the variables row, col 
			//TODO: call the method that sets the cell content to EMPTY
			
			
		
		

		/** Paint itself on the graphics canvas, given the Graphics context g */ 
		public void paint(Graphics g) {
			//Graphics2D allows setting of pen's stroke size
			Graphics2D graphic2D = (Graphics2D) g;
			graphic2D.setStroke(new BasicStroke(GamePanel.SYMBOL_STROKE_WIDTH, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
			
			//draw the symbol in the position
			int x1 = col * GamePanel.CELL_SIZE + GamePanel.CELL_PADDING;
			int y1 = row * GamePanel.CELL_SIZE + GamePanel.CELL_PADDING;
			if (content == Player.Cross) {
				graphic2D.setColor(Color.RED);
				int x2 = (col + 1) * GamePanel.CELL_SIZE - GamePanel.CELL_PADDING;
				int y2 = (row + 1) * GamePanel.CELL_SIZE - GamePanel.CELL_PADDING;
				graphic2D.drawLine(x1, y1, x2, y2);
				graphic2D.drawLine(x2, y1, x1, y2);
			}else if (content == Player.Nought) {
				graphic2D.setColor(Color.BLUE);
				graphic2D.drawOval(x1, y1, GamePanel.SYMBOL_SIZE, GamePanel.SYMBOL_SIZE);
			}
		}
		
		/** Set this cell's content to EMPTY */
		public void clear() {
			// TODO: Set the value of content to Empty (Remember this is an enum)
			this.content = Player.Empty;
			
//could be used to clear the board
//			for (row = 1; row < GamePanel.ROWS; ++row) {  
//				for (col = 1; col < GamePanel.COLS; ++col) {     
//					clear();
//				}
//			}
			
			

			
		}
}
