public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot chatBot1 = new ChatBot("debbie", 32);

        chatBot1.greeting("Kevin");
        chatBot1.weather();
        System.out.println("12 Feet to Meters is: " + chatBot1.convertFeetToMeters(12) + " Meters");
        chatBot1.favoriteNumber(50);
        System.out.println("The Sum of 5,3, and 23 is: " + chatBot1.addNumbers(5,3,23));
        System.out.println(chatBot1.goodbye());

        System.out.println("32 hours in minutes is: " + chatBot1.hoursToMinutes(32) + " minutes");
        chatBot1.scare();
    }
}
