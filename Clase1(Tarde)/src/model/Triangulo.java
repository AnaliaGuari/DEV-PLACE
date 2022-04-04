package model;

public class Triangulo {
		private float l1,l2,l3;
		
	//constructor
		public Triangulo(int l1, int l2,int  l3) {
			this.l1 =l1;
			this.l2 = l2;
			this.l3 = l3;
		}
		public String quienSoy() {
			
			if((l1 ==l2) && (l2 ==l3) && (l3 ==l3)) {
				return "el triangulo es equilatero";
			}
			
			if(l1 != l2 && l2 != l3 && l3 != l1) {
				return "el trinagulo es Escaleno";
			}else
			return "el trinagulo es isoseles";
		}
	
}
