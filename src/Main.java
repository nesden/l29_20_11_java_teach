public class Main {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World!";
        String concat = hello.concat(" ".concat(world));
        System.out.println("concat: ".concat(concat));

        String formatedString = String.format("100%%\tof the students are\nparticipants in the %d lesson", 29);
        System.out.println(formatedString);

        char charVar = '\'';
        System.out.println(charVar);
        String strVar = "\"Hello\\World\"";
        System.out.println(strVar);
    }
}
