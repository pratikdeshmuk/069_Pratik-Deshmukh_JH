class Sorting{
	
		void sort(int a[]){
			int n = a.length;
			
			for(int i = n; i>=0; i--)
			{
				int key = a[i];
				int j = i-1;
				while(j>=0 && a[j]>key){
					a[j] =a[j-1] ;
					j = j+1;
				}
				a[j] = key;
			}
		}
		
		void display(int a[]){
			for(int i =0; i < n; i++){
				System.out.println(a[i]);
			}
		}
		
		public static void main(String args[]){
			
			int a[] = {1, 2, 3, 4, 5};
			Sorting s1 = new Sorting();
			s1.sort(a);
			s1.display(a);
		}
}