public class Q {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(7);
        str.append("Java");
        System.out.println(str.capacity() + "," + str.length());
    }

}
