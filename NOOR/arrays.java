public class arrays {
    public static void main(String[] args) {
        //declaration first then initialisation
        int [] fighter;
        fighter = new int[4]; 

        //declaration and initialisation at the same time
        int[] technicians =new int[10];

        //declaration and initialisation with values 
        String[]players ={"messi","ronaldo","neymar","maradona","pele"};
        System.out.println("this array is not modified "+"="+players[0]);
        //changing the value in the third index in the array
        players[3] = "volla";
        //print after the change 
        System.out.println("modified array"+"="+players[3].toUpperCase()); 
       
        int[] numbers ={1,2,3,4,5};
        for (int i=0;i<numbers.length;i++);{
            System.out.println(numbers[i]);
        }

      
    }
    
}
