import java.util.Scanner;

public class accountlogin {
    static boolean aktuell = true;
    static int versuch = 3;

    public static void main(String[] args) {

    Scanner scanner = new Scanner((System.in));
        if (aktuell) {
            if (versuch > 0) {
                while(aktuell){
                    System.out.println("User name :");
                    String username = scanner.nextLine();

                    System.out.println("Passwort  :");
                    String password = scanner.nextLine();
                    boolean result = login(username,password);
                    if(result){
                        System.out.println("login is succesful");
                        break;
                    }
                    else{
                       if(versuch==0){
                            aktuell=false;
                            break;
                    }
                        }


                }

            }
        }
        else {
            System.out.println("Account ist nicht aktuell!!");
        }
    }

    public static boolean login(String username, String password) {
        if (username.equals("Umit") && password.equals("123")) {
            return true;
        }
        else {
            versuch--;
            System.out.println("username or passwort ist incorrect");



            if (versuch == 1) {
                System.out.println("sie haben nur 1 versuch");

            }
            else if(versuch == 0){
                System.out.println("Account ist blockiert!!!");
            }

        }
        return false;

    }


}
