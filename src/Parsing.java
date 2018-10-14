public class Parsing {
    public static void main(String[] args) {
        //converting int to string
        int num = 5;
        String word = "" + 5;

        System.out.println(num + word);

        String word2 = "50";
        int num2 = Integer.parseInt(word2);
        System.out.println(num2 + num);

//        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age..."));
//        System.out.println(num3 + 1);

        char ch = '2';
        String word3 = "" + ch;
        int num4 = Integer.parseInt(word3);

        System.out.println(num4);

        String word4 = "Tanushka";
        ch = word4.charAt(0);
        System.out.println(ch);

        for (int i = 0; i < word4.length(); i++) {
            System.out.println(word4.charAt(i));
        }
        for (int i = word4.length() - 1; i >= 0; i--) {
            System.out.println(word4.charAt(i));
        }

        //int to char
        char ch2;

        int num5 = 22;

        ch2 = ("" + num).charAt(0);
        System.out.println(ch2);

        //double to string
        double dNum = 22.9;
        String dWord = "" + dNum;

        int num6 = (int) dNum;
        System.out.println(dNum + " " + dWord + " " + num6);

        char dCh = ("" + dNum).charAt(2);
        System.out.println(dCh);

        //string to double
        String dWord2 = "22.9";
        dNum = Double.parseDouble(dWord2);
        System.out.println(dNum + 5);

        //int to double
        int num7 = 10;
        dNum = num7;
        System.out.println(dNum);

//        char to double
        char cd = '4';
        dNum = Double.parseDouble("" + cd);
        System.out.println(dNum + 5);
    }
}
