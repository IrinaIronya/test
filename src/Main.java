public class Main {
    public static void main(String[] args) {
        String a;
        int i = 9;
        boolean b = (i < 10 && i >= 60 || i == 9);

        if(b == true) { a = "true";
       }
       else {
            a = "false";

        }
        System.out.println(i);
        System.out.println(a);

        if(i < 10 && i >= 60) { a = "true";
        }
        else {
            a = "false";

        }
        System.out.println(i);
        System.out.println(a);

        if(i == 9) { a = "true";
        }
        else {
            a = "false";

        }
        System.out.println(i);
        System.out.println(a);

    }

}