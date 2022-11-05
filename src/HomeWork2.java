public class HomeWork2 {
    public static void main(String[] args) {
        //Level1: Астерикс и Обеликс варили зелье.
        //Зелье будет сварено правильно, если его будут варить больше 5 часов.
        //Астерикс варил его 3 часа, Обеликс в два раза меньше.
        //Получится ли у них сварить зелье? true - если получится, иначе false
        byte goodpotion=5;
        double astericspotion=3.0;
        double obeliskpotion=astericspotion/2;
        double sum=astericspotion+obeliskpotion;
        System.out.println(sum);
        boolean result=(goodpotion!=sum);
        System.out.println(result);

        //Level2: Вводится число. Если оно четное, то выведите true, иначе false
        int a=2002;
        int b=2;
        int c=a%b;
        System.out.println(c);
        boolean res=(c==0);
        System.out.println(res);
    }
    }
