class WhileDemo 
{
	public static void main(String[] args) 
	{
		int i=1;

		for(int i=0;i<5;i++)
		{
			System.out.println("for loop");
		}

		while(i<=5) {
            System.out.println("While loop");
            i++;
        }
		int k=6;
		do{
			
			System.out.println("do while");
			k++;
		}
		while(k<=5);
	}
}
