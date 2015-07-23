public class Bubblesort{

public static void bs(int a[])
{
	int n=a.length;
	int k;
		for(int m=n;m>0;m--){
		for(int i=0;i<n-1;i++){
		k=i+1;
			if(a[i] > a[k])
			   {
				swapnum(i,k,a);
			    }
			}
		pnum(a);
}
}
public static void swapnum(int i,int b,int a[])
{
int temp;
	temp=a[i];
	a[i]=a[b];
	a[b]=temp;
}
public static void pnum(int input[])
{
	for(int i=0;i<input.length;i++){
	System.out.println(input[i] + ", ");
	}

}
public static void main(String arg[])
{
int input[]={ 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        bs(input);
  
    }
}

