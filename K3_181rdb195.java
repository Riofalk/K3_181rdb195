import java.util.*;

public class K3_181rdb195 {
	
		
	public static void main(String[] args) {
		int[][] l; 
		int[][] path = new int[100][2];
		path[0][0]=1;
		path[0][1]=1;
		int r, c, m, path_token=1; //r - rows; c - columns; m - method number;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("row count: ");
		r = sc.nextInt();
		System.out.print("column count: ");
		c = sc.nextInt();
		l = new int[r][c];
		
		
		for (int i=0; i<r; i++)
		  for (int j=0; j<c; j++)
		    l[i][j] = sc.nextInt();
;
		
		    System.out.print("method number (1-3):");
		    m = sc.nextInt();
			sc.close();
			
			
		    switch (m) {
		    
		    case 1:		    	//1 - up; 2 - down; 3 - left; 4 - right;
		    	int cr=0, cc=0, token=0;
		    	do {
		    	  
		    		
		    	  //down
		    	  if (!(cr==r-1 || token==1)) {
		    		  if (l[cr+1][cc]==1) {
		    		    cr++;
		    		    token=2;
		    		    path[path_token][0] = cr+1;
		    		    path[path_token][1] = cc+1;
		    		    path_token++;
		    		  }
		    	  }
		    	
		    	  //up
		    	  if (!(cr==0 || token==2)) {
		    		  if (l[cr-1][cc]==1) {
		    		    cr--;
		    		    token=1;
		    		    path[path_token][0] = cr+1;
		    		    path[path_token][1] = cc+1;
		    		    path_token++;
		    		  }
		    	  }
		    	  
		    	  //right
		    	  if (!(cc==c-1 || token==3)) {
		    		  if (l[cr][cc+1]==1) {
		    		    cc++;
		    		    token=4;
		    		    path[path_token][0] = cr+1;
		    		    path[path_token][1] = cc+1;
		    		    path_token++;
		    		  }
		    	  }
		    	  
		    	  //left
		    	  if (!(cc==0 || token==4)) {
		    		  if (l[cr][cc-1]==1) {
		    		    cc--;
		    		    token=3;
		    		    path[path_token][0] = cr+1;
		    		    path[path_token][1] = cc+1;
		    		    path_token++;
		    		  }
		    	  }
		    	  
		    	} //do
		    	while (!( cr==r-1 && cc==c-1 ));
		    break;
		    
		    case 2: 
		    
		    break;
		    case 3: 
		    
		    break;
		}
		    
		    
		// rezultaatu izvade
		System.out.println("results:");
		for (int i=0; i<path_token; i++)
		System.out.print("(" + path[i][0] + "," + path[i][1] + ") ");
		}
	


}


