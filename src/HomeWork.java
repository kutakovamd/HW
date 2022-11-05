public class HomeWork {
    public static void main(String[] args){
        //В Китае живет 1 411 778 724 человек, всего в мире 197 стран.
        //Сколько бы человек жило на земле, если бы в каждой стране жило население, равное китайскому?
        long human=1_411_778_724;
        int country=197;
        long worldpeople= human*country;
        System.out.println(worldpeople);

        //Феликс прожил 3011456_567 секунд. Сколько лет прожил Феликс?
        // Посчитать, используя Java, Long-переменные и деление.
        //Кто не знает - по какой формуле посчитать - напишите мне, но сначала подумайте
        long sec=3_011_456_567L;
        double secmin=sec/60;
        System.out.println(secmin);
        double minhour=secmin/60;
        System.out.println(minhour);
        double houry=minhour/24;
        System.out.println(houry);
        double year=houry/365;
        System.out.println(year);//сколько прожил Феликс


    }
}
