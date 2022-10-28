
package lab3p1_tatianagarcia;
import java.util.Scanner;

public class Lab3P1_TatianaGarcia {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int opcion;
        
        do {
            System.out.println();
            System.out.println("--> Menu <--");
            System.out.println("1 -> Contar vocales");
            System.out.println("2 -> Sumatoria Pi");
            System.out.println("3 -> Time Clock");
            System.out.println("4 -> salida");
            System.out.println();
            System.out.println("Ingrese una opcion: ");
            opcion = leer.nextInt();
            
            switch (opcion)
            {
                case 1: 
                    
                    System.out.println();
                    System.out.println(">> Contar vocales <<");
                    System.out.println();
                    System.out.println("Ingrese una palabra: ");
                    String palabra;
                    palabra = leer.next().toLowerCase();
                    int contador =0;
                    
                    for(int i =0; i < palabra.length();i++)
                    {
                        char letra = palabra.charAt(i);
                        switch(letra)
                        {
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':

                                if (i < palabra.length()-1){
                                    char letra2 = palabra.charAt(i+1);
                                    switch (letra2)
                                    {
                                        case 'a':
                                        case 'e':
                                        case 'i':
                                        case 'o':
                                        case 'u':

                                            contador++;
                                            break;
                                    }
                                    
                                }
                                break;
                                
                        }//Fin del switch
                        
                    }//Fin del for
                    
                    System.out.println();
                    
                    if (contador > 0)
                    {
                        System.out.println(">> La palabra es un diptongo");
                    }
                    else 
                    {
                        System.out.println(">> La palabra no es un diptongo");
                    }
                    
                    break;
                    
                case 2: 
                    
                    System.out.println();
                    System.out.println(">> Suamatoria Pi <<");
                    System.out.println();
                    System.out.println("Ingrese un limite para la Sumatoria de Pi: ");
                    double lim = leer.nextDouble();
                    double n = 0, num2 = 0, num1, subtotal = 0;//contador 
                    
                    if (lim > 0){
                        
                        
                        while (n < lim)    
                        {
                            num1 = Math.pow(-1,n);
                            num2 = (num1)/(2*n + 1);
                            subtotal += num2;
                            n++;
                        }
                    
                        double total = subtotal*4;
                        System.out.println(">> Resultado: " + total);
                    }
                    else 
                    {
                        System.out.println(">> Numero ingresado no valido");
                    }
                    
                    break;

                case 3: 
                    
                    System.out.println();
                    System.out.println(">> Time Clock <<");
                    System.out.println();
                    System.out.println("Ingrese numero (impar) de filas : ");
                    int fil = leer.nextInt();
                    
                    int validacion = fil % 2;
                    
                    if (validacion == 0)
                    {
                        System.out.println(">> El numero ingresado no es impar ");
                    }
                    else 
                    {
                        //hacer aqui el codigo
                        
                        int con = 0, con2 = 1,con3 =3;
                        //arriba
                        for (int i = 0; i<(fil-1)/2;i++)
                        {
                            for (int j = 0+con; j<fil;j++)
                            {
                                System.out.print("*");
                                
                            }
                            System.out.println();
                            con +=2;
                            if (con > 0)
                            {
                                for (int x =0;x<con/2;x++)
                                {
                                    System.out.print(" ");
                                }
                            }
                        }//Numero de filas
                        
                        //medio
                        
                        for (int m = 0; m < ((((fil-1)/2)/2)/2)/2;m++)
                        {
                            System.out.print(" ");
                        }
                        System.out.println("*");
                        
                        //abajo
                        for (int i = 0; i<(fil-1)/2;i++)
                        {
                            for (int j = 0; j<((fil-1)/2)-con2;j++)
                            {
                                System.out.print(" ");
                                
                            }
                            
                            for (int j = 0; j < con3;j++)
                            {
                                System.out.print("*");
                            }
                            con2 +=1;
                            con3 +=2;
                            
                            System.out.println();
                        }//Numero de filas
                        
                    }
                    
                    break;
            }
            
        }while (opcion < 4);
        
        
        
    }
    
}
