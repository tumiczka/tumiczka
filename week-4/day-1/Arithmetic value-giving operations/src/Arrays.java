public class Arrays {
    public static void main(String[] args) {
        /*int[] tomb = new int[10];
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = (int) (Math.random() * 100 - 1);
        }
        for (int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i]+" ");
        }
        System.out.println();*/

        String[] Felsorolas = {"répa", "retek", "mogyoró"};
        for (String s : Felsorolas) {
            System.out.println(s);
        }
        //0    1    2
        //3    4    4
        //0    0    0
        int[][] twoDimensionalArray= new int[3][3];
        int[][] array={
                {0, 1, 2},
                {3, 4, 4},
                {0, 0, 0},
        };
        for(int i=0; i<=2; i++){
            for(int j=0; j<=2; j++){
                System.out.print((array[i][j]+" "));
            }
        }

    }
}
