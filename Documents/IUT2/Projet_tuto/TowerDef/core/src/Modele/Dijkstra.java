package Modele;


public class Dijkstra {

	public static void main(String [] args){
		
		int i,j;
		int MAX=10;
		int[][] tab = new int[MAX][MAX];
		
		for(i=0;i<MAX;i++)
		{
			for(j=0;j<MAX;j++)
			{
				tab[i][j]=0;
			}
		}
		
		tab[3][2]=900;
		tab[5][1]=900;
		tab[0][7]=900;
		tab[1][7]=900;
		tab[2][7]=900;
		tab[3][7]=900;
		tab[4][7]=900;
		tab[5][7]=900;
		tab[6][7]=900;
		tab[7][7]=900;
		tab[7][9]=900;
		tab[2][5]=900;
		tab[3][5]=900;
		tab[4][5]=900;
		tab[5][5]=900;
		tab[6][5]=900;
		tab[7][5]=900;
		tab[8][5]=900;
		tab[1][5]=900;
		
		
		for(i=0;i<MAX;i++)
		{
			for(j=0;j<MAX;j++)
			{
				System.out.print(tab[i][j] + "\t");
			}
		System.out.println(" ");
		}
		
		for(i=0;i<MAX-1;i++)
		{
			for(j=0;j<MAX-1;j++)
			{
				if(tab[i][j]!=900)
				{
					if (tab[i][j+1]!=900)
					{
					tab[i][j+1]=(tab[i][j]+1);
					}
					if (tab[i+1][j]!=900)
					{
					tab[i+1][j]=(tab[i][j]+1);
					}
				}
			}
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		for(i=0;i<MAX;i++)
		{
			for(j=0;j<MAX;j++)
			{
				System.out.print(tab[i][j] + "\t");
			}
		System.out.println(" ");
		}				
	}
}

