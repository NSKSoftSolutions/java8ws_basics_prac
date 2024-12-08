public class SingelDimesionalArray {
    public static void main(String[] args) {
        //10,20,30,40,100,200,300,400 -8,int
        // datatype[] objectName=new datatype[size_of_the_array];
        int[] a = new int[8];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 100;
        a[5] = 200;
        a[6] = 300;
        a[7] = 400;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
