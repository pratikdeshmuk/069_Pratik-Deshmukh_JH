class TwoStacks{
		int max = 10;
		int top1, top2;
		int a[];
		
		TwoStacks(){
			a = new int[max];

		top1 = -1;
			top2 = max;
		}
		
		
		void push1(int d){
			if(top1>top2-1){
				System.out.println("Full");
			}
			else{
				top1++;
				a[top1] = d;
			}
		}
		
		void push2(int d){
			if(top1>top2-1){
				System.out.println("Full");
			}
			else{
				top2--;
				a[top2] = d;
			}
		}
		
		int pop1(){
		   if(top1<=0)
		   {System.out.println("Empty");}
			else{
				int q = a[top1];
				top1--;
				return q;
				
			}
			return 0;
		}
			   
			 int pop2(){
		   if(top2>max)
		   {System.out.println("Empty");}
			else{
				int q = a[top2];
				top2++;
				return q;
				
			}
			return 0;
		}

			public static void main(String args[])
			{
				TwoStacks t = new TwoStacks();
				t.push1(5);
				t.push2(10);
				t.push2(15);
				t.push1(11);
				t.push2(7);
				t.push2(40);
				
				System.out.println("Popped element from stack 1 is "+t.pop1());
				System.out.println("Popped element from stack 1 is "+t.pop2());
			}
}