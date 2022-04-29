
/**
 * You will be given a string (x) featuring a cat 'C', a dog 'D' and a mouse 'm'. 
 * The rest of the string will be made up of '.' (periods)
 * 
 * You need to find out if the cat can catch the mouse from it's current position.
 * The cat can jump (j) characters.
 * 
 * Also, the cat cannot jump over the dog.
 *
 * @author Joseph Capper
 * @version 4/28/2022
 */
public class CatAndMouse
{

    public String isCaught(String x, int j) {
        //Assuming input string is valid

        //Variables
        String cat = "C";
        String mouse = "m";
        String dog = "D";
        int firstIndex = 0;
        String found = "";
        
        //Loop through string to find first variable
        for(int i = 0; i < x.length(); i++){
            String test = x.substring(i,i+1);
            if(test.equals(cat)){
                firstIndex = i;
                found = cat;
                break;
            }
            else if(test.equals(mouse)){
                firstIndex = i;
                found = mouse;
                break;
            }
            else if(test.equals(dog)){
                firstIndex = i;
                found = dog;
            }
        }

        //If no variables are found
        if(found.equals("")) return "boring without all three";

        for(int i = firstIndex; j > 0; j--){
            i++;
            String test = x.substring(i,i+1);

            if(test.equals(mouse)){
                return("Caught!");
            }

            else if(test.equals(cat)){
                return("Caught!");
            }

            else if(test.equals(dog)){
                return("Protected!");
            }

        }

        return "Escaped!";
    }

    public static void main (String args[]){
        CatAndMouse cm = new CatAndMouse();

        //Test Cases
        String in = "............";
        int j = 7;
        System.out.println("Input String: " + in + " \nj: " + j);
        System.out.println(cm.isCaught(in,j));
        System.out.println();
        
        in = "..C.....m.";
        j = 7;
        System.out.println("Input String: " + in + " \nj: " + j);
        System.out.println(cm.isCaught(in,j));
        System.out.println();

        in = "..m.....C.";
        j = 7;
        System.out.println("Input String: " + in + " \nj: " + j);
        System.out.println(cm.isCaught(in,j));
        System.out.println();

        in = ".....C............m......";
        j = 7;
        System.out.println("Input String: " + in + " \nj: " + j);
        System.out.println(cm.isCaught(in,j));
        System.out.println();
        
        in = ".....m............C......";
        j = 7;
        System.out.println("Input String: " + in + " \nj: " + j);
        System.out.println(cm.isCaught(in,j));
        System.out.println();

        in = "..C....D..m";
        j = 13;
        System.out.println("Input String: " + in + " \nj: " + j);
        System.out.println(cm.isCaught(in,j));
        System.out.println();
        
        in = "..m....D..C";
        j = 13;
        System.out.println("Input String: " + in + " \nj: " + j);
        System.out.println(cm.isCaught(in,j));
        System.out.println();
        
        in = ".D....m....C";
        j = 6;
        System.out.println("Input String: " + in + " \nj: " + j);
        System.out.println(cm.isCaught(in,j));
        System.out.println();
        
        in = ".Dm....C";
        j = 6;
        System.out.println("Input String: " + in + " \nj: " + j);
        System.out.println(cm.isCaught(in,j));
        System.out.println();
        
        in = ".m....CD";
        j = 6;
        System.out.println("Input String: " + in + " \nj: " + j);
        System.out.println(cm.isCaught(in,j));
        System.out.println();
        
        in = ".DC....m";
        j = 6;
        System.out.println("Input String: " + in + " \nj: " + j);
        System.out.println(cm.isCaught(in,j));
        System.out.println();
        
        in = "CDm";
        j = 3;
        System.out.println("Input String: " + in + " \nj: " + j);
        System.out.println(cm.isCaught(in,j));
        System.out.println();
        
        in = "mDC";
        j = 3;
        System.out.println("Input String: " + in + " \nj: " + j);
        System.out.println(cm.isCaught(in,j));
        System.out.println();
        
        in = "DCm......";
        j = 3;
        System.out.println("Input String: " + in + " \nj: " + j);
        System.out.println(cm.isCaught(in,j));
        System.out.println();
        
        in = ".........CmD";
        j = 3;
        System.out.println("Input String: " + in + " \nj: " + j);
        System.out.println(cm.isCaught(in,j));
        System.out.println();

    }
}