public class HelpClassDemo {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice, ignore;
        helpon helpobj = new helpon();

        for (;;){

            do {
                helpobj.showmenu();

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!helpobj.isvalid(choice) );

            if (choice == 'q') break;

            System.out.println("\n");

            helpobj.helpon(choice);
        }
    }
}
