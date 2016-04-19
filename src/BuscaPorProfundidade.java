import java.io.File;


public class BuscaPorProfundidade {
	
	
	public void BuscaProfundidade(File f) 
	{
		File[] filhos = f.listFiles();
		for (File filho : filhos)
			{ 
				
				if (filho.isDirectory()) 
				{
					BuscaProfundidade(filho);
				}
				System.out.println(filho.getAbsolutePath());
			}

	}	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
			File path= new File("K:/henrique");
			BuscaPorProfundidade f = new  BuscaPorProfundidade();
			f.BuscaProfundidade(path);
	}
}


