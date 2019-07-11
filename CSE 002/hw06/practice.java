public class practice{
    public static void main(String[] args){
        for(int row = 0; row < 7; row++){
            for(int col = 0; col < 7- row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}