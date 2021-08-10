package Backend;
import java.util.Arrays;



public class Cube_Related_stuff {
    
    public static String Scramble_Algorithm(){
        
        String Moves[] = {"R","R'","R2","L","L'","L2","F","F'","F2","U","U'","U2","F","F'","F2","B","B'","B2"};
        
        String Scramble[] = {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"};
        
        int total_moves = 25;
        for(int i = 0; i < total_moves ; i++)
        {
            if(i == 0)
            {
                Scramble[i] = Moves[(int)(Math.random()*(Moves.length - 0 + 0))];
            }
            
            else if(Scramble[i].equals(Scramble[i-1]))
            {
                Scramble[i] = Moves[(int)(Math.random()*(Moves.length - 2 + 1))];
            }
            
            else{
                Scramble[i] = Moves[(int)(Math.random()*(Moves.length - 0 + 0))];
            }
        }
        
        StringBuffer buffer = new StringBuffer();
        
        for(int j = 0; j < Scramble.length; j++)
        {
            buffer.append(Scramble[j]);
        }
        
        String Scramble_Algorithm = buffer.toString();
        Scramble_Algorithm.replaceAll(""," ");
        
        System.out.println(Scramble_Algorithm);
        
        return Scramble_Algorithm;
    }
    
    public static void main(String[] args) {
        Scramble_Algorithm();
    }
}
