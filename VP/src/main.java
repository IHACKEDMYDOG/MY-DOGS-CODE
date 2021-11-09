import java.util.Arrays;//VYBOROCHNAYA SORTIROVKA DVUMERNIY MASSIV
class main {
    public static void main(String[] args) {
        int num[][] = {
                {13, 31, 45, 54},
                {65, 54, 73,  85}};

        int[] flat = new int[2 * 4];
        int ctr = 0;
        for (int i = 0; i < 2; i++) {
            for (int m = 0; m < 4; m++) {
                flat[ctr++] = num[i][m];
            }//PEREVODIMM V PLOSQUYI FORMY MASSIVA
        }
        Arrays.sort(flat);
        ctr = 0;
        for (int i = 0; i < 2; i++) {
            for (int m = 0; m < 4; m++) {
                num[i][m] = flat[ctr++];
            }
        }
        for (int i = 0; i< 2; i++) {
            for (int m= 0; m< 4; m++) {
                System.out.print("OTSORTYROVANNYI MASSIV " + " " + num[i][m] + " ");
            }
            System.out.println();
        }
    }
}