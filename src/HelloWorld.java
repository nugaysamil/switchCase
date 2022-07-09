public class HelloWorld {
    public static void main(String[] args) {
        int switchValue = 3;

        switch (switchValue) {

            case 1:
                System.out.println("Value was 1");
                break;


            case 2:
                System.out.println("Value was 2");
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;

            case 3:  case 4: case 5:
                System.out.println("3 4 5 oldu");
                break;
        }

        char charValue = 'A';
        switch (charValue) {

            case 'A':
                System.out.println("A was found");
                break;

            case 'B':
                    System.out.println("B was Found");
                    break;

            case 'C': case 'G': case 'E':
                System.out.println("C,G,E was Found");
                break;

        }
        String mount = "January";
        switch (mount.toLowerCase()){
            case "January":
                System.out.println("January okey");
                break;

            case "Jun":
                System.out.println("Jun okey");
                break;

            default:
                System.out.println("Jun or January have not ");
                break;
        }


        int a = 1;
        if (a == 2) {
            System.out.println("1 okey" + a);


        }else {
            System.out.println("bulunamadı");
        }

    }
}


