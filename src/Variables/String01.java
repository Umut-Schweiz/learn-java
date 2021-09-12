package variables;

public class String01 {

    public static void main(String[] args) {

        String name = "Suleyman";
        System.out.println(name);//Suleyman

        String surname = "Can";

        System.out.println(name + surname);//SuleymanCan
        System.out.println(name + " " + surname);//Suleyman Can

        //int data type'ine char atamasi yaparsaniz Java o char'in sayi degerini alir

        int firstSmallLetter = 'a';
        System.out.println(firstSmallLetter);//97

        int squareBracket = '[';
        System.out.println(squareBracket);//91

        //Iki tane char arasina herhangi bir matematiksel islem koyarsaniz Java
        //o char'larin ASCII degerleri uzerinden islem yapar

        System.out.println('a' + 'b');//Ekrana 97+98 yani 195 yazar

        //Illa ki char'lari yanyana yapistirmak isterseniz en basa bos String koyun
        System.out.println("" + 'a' + 'b');//ab

    }
}
