public class JavaMath {
    public static void main(String[] args) {
        System.out.println(Math.max(18292938, Math.max(3847474, 84847456)));
        System.out.println(Math.min(18292938, Math.min(3847474, 84847456)));
        System.out.println(Math.floor(Math.random() * 200 + 51));
        System.out.println(Math.ceil(Math.random() * 5));
        System.out.println(Math.sqrt(144));
        System.out.println(Math.pow(3, 4));

//        get random number between 367 and 528
        int upper = 372;
        int lower = 367;
//        The range is 161 = upper - lower
        System.out.println((int) (Math.random() * (upper - lower) + lower + 1));

        System.out.println(Math.E);
        System.out.println(Math.exp(10));
        System.out.println(Math.expm1(1));
        System.out.println(Math.round(1.5));
        System.out.println(Math.log(Math.pow(Math.E, 5)));
        System.out.println(Math.log10(Math.sqrt(10000)));

        System.out.println(Math.PI);
        System.out.println("Result in radians: " + Math.toRadians(30));
        System.out.println("Result in radians: " + (30 * Math.PI / 180));

        System.out.println("Result in degrees: " + Math.toDegrees(1));
        System.out.println("Result in degrees: " + (1 * 180 / Math.PI));
    }
}
