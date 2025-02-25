import java.util.Scanner;

public class FindTypeOfWebsite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter url : ");
        String url = input.nextLine();

        String protocol = url.substring(0, url.indexOf(':'));

        //System.out.println("Protocol : " + protocol);

        if (protocol.equals("http")){
            System.out.println("Hypertext Transfer Protocol");
        } else if (protocol.equals("ftp")){
            System.out.println("File Transfer Protocol");
        }

        String extension = url.substring(url.lastIndexOf('.')+1);
        //System.out.println("Extension : " + extension);

        if (extension.equals("com")){
            System.out.println("Commerical.");
        }else if (extension.equals("org")){
            System.out.println("Organisation.");
        }else if (extension.equals("net")){
            System.out.println("Network.");
        }
    }
}
