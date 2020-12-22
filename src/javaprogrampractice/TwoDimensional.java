package javaprogrampractice;

public class TwoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[][]= new String[3][3 ];
		System.out.println(s.length);//-->total no.of rows
		System.out.println(s[0].length);//--->total no.of columns
		s[0][0]="a";
		s[0][1]="b";
		s[0][2]="c";
		
		
		s[1][0]="f";
		s[1][1]="g";
		s[1][2]="h";
		
		
		s[2][0]="i";
		s[2][1]="j";
		s[2][2]="k";
		
		for (int i=0; i<s.length;i++)
		{
			System.out.println("row no:"+i);
			for (int j=0;j<s[0].length;j++)
			{
				System.out.println(s[i][j]);
			}
			
		}
		
		

	}

}
