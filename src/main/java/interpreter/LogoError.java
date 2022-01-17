package interpreter;

public class LogoError extends RuntimeException {
    private final static int CHARS_PER_LINE = 60;

    public LogoError(int line, int index, String message) {
        super(buildErrorMessage(line, index, message));
    }
    
    public static String buildErrorMessage(int line, int index, String message) {
        System.out.println("Error at line: " + line + ", element: " + index + ", Message:\n"
                + getSplitMessage(message));
        return "Error at line: " + line + ", element: " + index + ", Message:\n"
                + getSplitMessage(message);
    }

    private static String getSplitMessage(String message) {
        System.out.println(message);
        StringBuilder builder = new StringBuilder();
        int index = 0;
        while (index <= message.length()) {
            builder.append(message, index, Math.min(index+CHARS_PER_LINE, message.length()))
                    .append('\n');
            index += index+CHARS_PER_LINE;
        }
        return builder.toString();
    }
}
