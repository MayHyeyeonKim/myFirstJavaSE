public class TwoDimArrayTest {
    public static void main(String[] args) {
//        //2행4열의 정수형 배열을 생성하시오!
//        int[][] a = new int[2][4];
//        a[0][0]=10;
//        a[0][1]=10;
//        a[0][2]=10;
//        a[0][3]=10;
//
//        a[1][0]=10;
//        a[1][1]=10;
//        a[1][2]=10;
//        a[1][3]=10;
//
//        System.out.println(a[0][0]+"\t"+a[0][1]+"\t"+a[0][2]+"\t"+a[0][3]);
//        System.out.println(a[1][0]+"\t"+a[1][1]+"\t"+a[1][2]+"\t"+a[1][3]);
        int[][] a= {
                {1,2,3,4},
                {5,6,7,8}
        };
        for(int i=0;i<a.length;i++){
            for(int j=0; j<a[i].length;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        int[][] b=new int[5][];
        b[0]=new int[1];
        b[1]=new int[2];
        b[2]=new int[3];
        b[3]=new int[4];
        b[4]=new int[5];
        for(int i=0; i<b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j]='☆';
                System.out.print((char) b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
