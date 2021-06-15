package com.first.cours;

public class ExempleWhile {

	public static void main(String[] args) {
		String str = "jhgvjhvjgpp";

		long nombre = 5 , fact = 1 ;
		while (5 > str.length()) 
		{
			System.out.println("Bravo");
		}
		int i = 1 ;
		do {
			fact = fact * i ;
			i++;
		}
		while (i <= nombre);
		
		System.out.println(fact);

//		for (int i = 0 ; i < str.length() ; i++) {
//			if (str.charAt(i) == 'e') {
//				System.out.println("jai trouvé un 'e' !!!");
//				break;
//			}
//		}


//		int i = 0;
//		while (i < str.length())
//		{	
//			if (str.charAt(i) == 'e') {
//				System.out.println("jai trouvé un 'e' !!!");
//				break;
//			}
//			i++;
//		}
		
		
		
//		int i = 0; boolean etrouve = true ;
//		while (str.charAt(i) != 'e') {
//			
//			if (i == str.length()) {
//				etrouve = false;
//				break;
//			}
//			i++;
//		}
//		if (etrouve)
//			System.out.println("jai trouvé un 'e' !!!");
		
		
		 // if (etrouve) = if (etrouve == true)
		// if (!etrouve) = if (etrouve == false)

	}

}
