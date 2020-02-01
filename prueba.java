
public class prueba {
	
	static boolean algunMultiploD3enlaFila(int[] fila){
		boolean ret=false;
		for(int i=0;i<fila.length;i++) {
			ret= ret || fila[i]%3==0;
		}return ret;
	}
	static boolean todosmultiplosD5enCol(int[][]mat, int x) {
		boolean ret=true;
		for(int i=0; i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
			ret= ret && mat[i][x]%5==0;
			}
		}return ret;
	}
	static boolean fila3col5(int [][] mat) {
		boolean retF=true;
		boolean retC=false;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
			retF=retF && algunMultiploD3enlaFila(mat[i]);
			retC=retC || todosmultiplosD5enCol(mat, j);
			}
		  }return retF && retC;
	   }
	
	public static boolean ejercicio1(int[][]mat) {
		boolean ret=false ;
		for(int i=0;i<mat.length;i++) {
			ret=ret || contadorDeDivisibles(mat[i],i,i,mat)==2;
		}
		return ret;
	}
	
	
	public static int contadorDeDivisibles(int[]fila,int c,int f,int[][]mat) {
		int cont=0;
		for(int i=0;i<fila.length;i++) {
			if(dividea(mat[f][i],mat[i][c])) {
				cont++;
			}
		}return cont;
	}
	static boolean dividea(int a, int b) {
		if(a%b==0) {
		return true;
	}return false;
	}
	public static void main(String[] args) {
		int [][]mat= new int[3][3];
		mat[0][0]=4;
		mat[0][1]=8;
		mat[0][2]=8;
		mat[1][0]=2;
		mat[1][1]=1;
		mat[1][2]=2;
		mat[2][0]=2;
		mat[2][1]=1;
		mat[2][2]=2;
		
		
		System.out.println(ejercicio1(mat));
		
	}

}
