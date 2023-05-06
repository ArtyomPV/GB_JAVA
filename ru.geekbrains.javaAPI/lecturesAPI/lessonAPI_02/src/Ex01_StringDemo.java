public class Ex01_StringDemo {
    public static void main(String[] args) {
        String[] arrayName = {"A", "r", "t", "y", "o", "m"};
        String name = "ARTYOM";
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(String.join("",arrayName));
        System.out.println(String.join(",",arrayName));
        System.out.println(String.join(" ", arrayName));

    }
}
