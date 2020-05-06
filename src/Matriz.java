/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fede
 */
public class Matriz {
  
  
    public void armar()
    {
        int[][]  matriz = {{3,6,9,12},{15,18,21},{24,27,30,33,36},{39,42}};
        for (int x=0; x < matriz.length; x++) 
        {
            int a = x+1;
            System.out.print("Fila " + a + "--> ");
            for (int y=0; y < matriz[x].length; y++) 
            { 
                if (matriz[x][y]%2 ==0)
                    System.out.print(matriz[x][y]+" ");
            }
            System.out.println();
        }
    }
    
}
