package clsobj;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[][]= {{"testing tools","qtf","uft"},{"A","B","C"}};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		
	}

}
