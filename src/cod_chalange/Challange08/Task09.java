package cod_chalange.Challange08;

public class Task09 {
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * create ediniz.
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */


        int multiArr[][] = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};
        int toplam = 0;
        çiftleritopla(multiArr, toplam);
        System.out.println(çiftleritopla(multiArr, toplam));
    }

    private static int çiftleritopla(int[][] multiArr, int toplam) {
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                if (multiArr[i][j] % 2 == 0) {
                    toplam += multiArr[i][j];
                }

            }


        }return toplam;
    }

}