package javaJenkinsIntegration;

public class TestJenkins 
{
	
	public static void main(String[] args) 
	{
		System.out.println(System.getProperty("user.dir"));
		
		for(int i=1; i<=20; i++)
		{
			System.out.println(i+"-------->>> Success: Jenkins is Integrated with Java....!!!");
		}
		
	}

}


