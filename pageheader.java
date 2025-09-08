public class PageHeader {

    // Method to print a formatted page header
    public static void printHeader(String title) {
        int width = 50; // total width of header
        String border = "=".repeat(width);

        // Center the title inside the width
        int padding = (width - title.length()) / 2;
        String formattedTitle = " ".repeat(Math.max(padding, 0)) + title;

        // Print header
        System.out.println(border);
        System.out.println(formattedTitle);
        System.out.println(border);
    }

    public static void main(String[] args) {
        printHeader("Employee Report");
        printHeader("Sales Dashboard");
        printHeader("System Logs");
    }
}
