public class array {
    public static void main(String[] args) {
        int[] arry = new int[3];
        arry[0] = 1;
        arry[1] = 2;
        arry[2] = 3;
        for (int i = 0; i < 2; i++) {
            System.out.print(arry[i] + ",");
        }
        for (int i = 2; i < 3; i++) {
            System.out.println(arry[i]);
        }


        double[] arry1 = {1.57, 7.654, 9.986};
        for (int v = 0; v < arry1.length; v++) {
            if (v == arry1.length - 1) {
                System.out.println(arry1[v]);
            } else
                System.out.print(arry1[v] + ",");
        }//если меняю на double почему выдает ошибку ?


        int[] ayy3 = {123, 234, 15, 24, 245};
        for (int e = 0; e < ayy3.length; e++) {
            if (e == ayy3.length - 1) {
                System.out.println(ayy3[e]);
            } else
                System.out.print(ayy3[e] + ",");
        }

        int[] ary = new int[3];
        ary[0] = 1;
        ary[1] = 2;
        ary[2] = 3;
        for (int q = ary.length - 1; q > 0; q--) {
            System.out.print(arry[q] + ",");
        }
        System.out.println(arry[0]);

        double[] ary1 = {1.57, 7.654, 9.986};
        for (int d = ary1.length - 1; d > 0; d--) {
            System.out.print(arry1[d] + ",");
        }
        System.out.println(ary1[0]);

        int[] ay3 = {123, 234, 15, 24, 245};
        for (int w = ay3.length - 1; w > 0; w--) {
            System.out.print(ay3[w] + ",");
        }
        System.out.println(ay3[0]);

        int[] ary4 = new int[3];
        ary4[0] = 1;
        ary4[1] = 2;
        ary4[2] = 3;
        for (int z = 0;z<ary4.length; z++) {
            if (ary4[z] % 2 == 0) {
                System.out.print(ary4[z]);
            }else {
                ary4[z]=ary4[z]+1;
                System.out.print(ary4[z]);
            }
        }
    }
}







