package variables;

public class TypeCasting {

    public static void main(String[] args) {

        int i1 = 5/2; // decimal (ondalık) bir sayıyı byte, short,int, long gibi bir tamsayıya assign edersek
        //Java o virgüllü sayının ondalık kısmını iptal eder sadece tam kısmı yazar (yuvarlama yapmaz)
        System.out.println(i1);

        // Java int/int sonucunu tamsayı olarak return eder
        double d1 = 5/2;
        System.out.println(d1);//2.0

        //Matematiksel işlemlerde birden fazla data tip kullanılırsa Java sonucu en büyük data type 'e göre verir.
        double d2 = 5.0/2;
        System.out.println(d2);

        int i2 = 5/2; // decimal (ondalık) bir sayıyı byte, short,int, long gibi bir tamsayıya assign edersek
        //Java o virgüllü sayının ondalık kısmını iptal eder sadece tam kısmı yazar (yuvarlama yapmaz)
        System.out.println(i1);


        // Java int/int sonucunu tamsayı olarak return eder
        double d3 = 5/2;
        System.out.println(d1);//2.0

        //Matematiksel işlemlerde birden fazla data tip kullanılırsa Java sonucu en büyük data type 'e göre verir.
        double d4 = 5.0/2;
        System.out.println(d2);

        double dd1 = 100.235;
        int ii1    = (int)d1;
        System.out.println(i1);

        int ii2     = 5;
        double dd2  = 6.2;
        System.out.println(i2+d2);

        short num1 = 255;
        byte num2  = (byte)num1;
        System.out.println(num2);// -1

        int no1    = 5/2;
        System.out.println(no1);//5

        float no2  = 5f/2f;
        System.out.println(no2);//2.5

        double no3 = 5d/2d;//2.5
        System.out.println(no3);

        float f3  = 3.23f;

        double dd3 = (float)f3;
        System.out.println(f3);

    }

}
