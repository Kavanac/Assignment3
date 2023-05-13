//3. WAP to sort an array using Bubble Sort Algorithm.

public class Question3 {

	public static void main(String[] args) {
		int a[]= {70,90,10,30,20};
		
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-1;j++) {
				if(a[j]<a[j-1]) {
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		System.out.println("Array after sorting: ");
		for(int elem:a) {
			System.out.print(elem+" ");
		}

		
	}

}
