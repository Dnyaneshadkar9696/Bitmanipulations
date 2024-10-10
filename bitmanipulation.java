public class bitmanipulation {
    public static void main(String[] arc) {
        int ramesh44 = tosum44();
        System.out.println(ramesh44);

    }

    public static int tosum44() {
        int n = 15;
        int result = 0;
        int helper = 1;
//        1011
//        1011 & 0001
//        1011 & 0010
//        1011 & 0000
//        1011 & 1000 so we do it with every one

        for (int i = 1; i <= 32; i++) {
            if ((helper & n) != 0) {
                result++;
            }
            helper = helper << 1;
        }
        return result;
    }
}