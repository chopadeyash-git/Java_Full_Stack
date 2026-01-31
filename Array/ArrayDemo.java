class ArrayDemo 
{
	public static void main(String[] args) 
	{
	  int arr[]=new int[5];
	  int arr1[]={10,11,12,13,14,15,16};
	   for(int i=0;i<arr1.length;i++){
			System.out.println("at index "+i+ " values is = "+arr1[i]);
		}
		System.out.println("                          ");
		for(int data:arr1)
		{
			System.out.println(data);
		}
	}
}
