package day20;

public class Get2SiblingChar {
    public static void main(String[] args) {

         //given a String with even number character count
        //print 2 characters in one line
        //             0123
        //for example: Ayra

        /*
         * Ay
         * yr
         * ra
         *
         * */

        String name = "Ayra";

        int lastCharIndex = name.length()-1;

        System.out.println(name.substring(0,2));
        System.out.println(name.substring(1,3));
        System.out.println(name.substring(2,4));

        for(int x=0; x<=lastCharIndex-1;x++){
            System.out.println(name.substring(x, x+2));
        }

        //for example: Ayra
        //Ayr 012 -->>03
        //yra 123 -->>14
        System.out.println("Getting 3 character");
        for(int x=0; x<=lastCharIndex-2;x++){
            System.out.println(name.substring(x, x+3));
        }
    }
}
