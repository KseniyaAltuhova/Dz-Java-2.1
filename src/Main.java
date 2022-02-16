public class Main {
    public static void main(String[] args) {
        int price = 10_000; //цена билета
        int amount = 20; // количество рублей для одной бонусной мили
        int bonusmile = price / amount; //количество бонусных миль с покупки билета
        System.out.println("За приобретенный билет начислено " + bonusmile + " бонусных миль");
    }
}
