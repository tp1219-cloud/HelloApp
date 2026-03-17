public class UC6HelloApp {
    public static void main(String[] args) {

        StringBuilder names = new StringBuilder();

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            for (String name : args) {
                names.append(name).append(", ");
            }

            String result = names.substring(0, names.length() - 2);

            System.out.println("Hello, " + result + "!");
        }
    }
}
