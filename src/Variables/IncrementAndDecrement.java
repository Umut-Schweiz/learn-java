package variables;

public class IncrementAndDecrement {

    public static void main(String[] args) {

        //Increase = Artırmak (fiil)    Increment = Artırım(Artış) (isim)

        //Increment 1. Yol
        int s = 12;
        System.out.println(s);//12

        s = s + 3;
        System.out.println(s);//15

        s = s + 5;
        System.out.println(s);//20

        //Increment 2. Yol
        int t = 22;

        t += 3;//Bu ifade t = t + 3 ile aynıdır

        System.out.println(t);

        //Sadece 1 artıracaksanız aşağıdaki yöntemi kullanın
        int u = 32;
        System.out.println(u);//32

        u++;// Bu ifade u = u + 1 ;  veya u += 1;  ile aynıdır ama 1 artırmalarda hep bu kullanılır.
        System.out.println(u);


        //Çarpma ile increment

        int v = 42;
        v = v * 2;
        System.out.println(v);
        v *= 3;
        System.out.println(v);

        // ********************Decrease*******************

        //Decrease = Azaltmak(Fiil)    Decrement = Azalış(İsim)


        int number = 12;
        System.out.println(number);

        // Decrement 1. Yol
        number = number - 13;
        System.out.println(number);

        // Decrement 2 . Yol

        int number2 = 22;
        number2 -= 3;
        System.out.println(number2);

        //Sadece 1 azaltacaksınız aşağıdaki yöntemi kullanın

        int number3 = 33;
        System.out.println(number3);

        number3 --;
        System.out.println(number3);

        //Bölme ile decrement
        int number4 = 52;
        number4 = number4/2;
        System.out.println(number4);

        number4 /= 2;
        System.out.println(number4);

    }
}
