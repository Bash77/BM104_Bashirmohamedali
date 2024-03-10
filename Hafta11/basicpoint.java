import java.util.Arrays;

public class ReferenceMystery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BasicPoint p= new BasicPoint(11,22);
int [] a = {33,44};
int n= 55;

System.out.println(p.x  +Arrays.toString(a)+ "" +n);
mystery(p,a,n);
System.out.println(p.x  +Arrays.toString(a)+ "" +n);

a[0] = a[1];
p.x=p.y;

mystery(p,a,n);
System.out.println(p.x + "" +Arrays.toString(a)+ "" +n);
}

public static void mystery(BasicPoint p, int[]a, int n) {
	n=0;
	a[0]=a[0] +11;
a[1]=77;
p.x=p.x +33;
System.out.println(p.x + "" +Arrays.toString(a)+ "" +n);

	}

}

/*
public class BasicPoint{
	int x;
	int y;
	public BasicPoint(int initalX,int initialY){
		x=initialX;
		y=initialY;
		*/
	}
}
