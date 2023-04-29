import java.util.Scanner;

class LacosRepeticao {
  
	public static void main(String args[]){  
   
    		Scanner teclado = new Scanner(System.in);   
       
        int i = 0;
        
        for(i = 0; i <= 10; i++){
          System.out.printf("%d \n", i); 
        }
          
        i = 0;
        
        while(i <= 10){          
          
          System.out.printf("%d \n", i); 
          
          i ++;
          
        };
        
        i = 0;
        
        do{          
          
          System.out.printf("%d \n", i); 
          
          i ++;
          
        }while(i <= 10);
    
    		

    		System.exit(0);
		
	}

}
