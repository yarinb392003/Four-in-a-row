import java.awt.Color;
import java.awt.Graphics;

public class board {
	public circle[][]arr;
	public board() 
	{
		this.arr=new circle[6][7];
	}
	public void add(int index,Graphics g)
	{
		int j=0;
		for(int i=6;i>=0;i--)
		{
			if(this.arr[i][index]==null)
			{
				j=i;
				break;
			}
				
		}
		g.setColor(Color.PINK);
		g.fillOval(97*index, 88*j, 50,50);
	}

}
