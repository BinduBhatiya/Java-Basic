/*

what is command line argument ?
    in command line argument we need to pass the value of args at the runtime.

*/


public class command_line_args {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
