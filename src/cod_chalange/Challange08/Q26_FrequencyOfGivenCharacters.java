package cod_chalange.Challange08;

public class Q26_FrequencyOfGivenCharacters {
	/*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı)  print eden   METHOD create ediniz..

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */


    public static void main(String[] args) {
        String str="AAABBCDD";
        frekans(str);

    }

    private static void frekans(String str) {
        int harfsayısı=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.substring(i,i+1).equals(str.substring(j,j+1))){
                    harfsayısı++;
                }
            }


        }

    }
}
