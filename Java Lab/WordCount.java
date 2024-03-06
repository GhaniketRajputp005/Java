import java.util.Scanner;

class WordExample {
    private String strdata;

    WordExample(String str) {
        strdata = str;
    }

    void countWord() {
        // char ch[] = strdata.toCharArray();
        int j = 0, ctr = 0;
        for (int i = 0; i < strdata.length(); i++) {

            if (strdata.charAt(i) == ' ' || strdata.charAt(i) == '.' || strdata.charAt(i) == '?'
                    || strdata.charAt(i) == '!') {
                if ((strdata.charAt(i - 1) == 'A' || strdata.charAt(i - 1) == 'E' || strdata.charAt(i - 1) == 'I'
                        || strdata.charAt(i - 1) == 'O' || strdata.charAt(i - 1) == 'U') &&
                        (strdata.charAt(j) == 'A' || strdata.charAt(j) == 'E' || strdata.charAt(j) == 'I'
                                || strdata.charAt(j) == 'O' || strdata.charAt(j) == 'U')) {

                    System.out.println("i-1 = " + strdata.charAt(i - 1) + " j = " + strdata.charAt(j));
                    ctr++;
                    // String sub = strdata.substring(j,i-1);
                    // placeWord(sub);

                }
                j = i + 1;

            }

        }
        System.out.println("words = " + ctr);

    }


    // void placeWord(String sub){
    //     String strnew = null;
    //     strnew.concat(sub);


    // }

}

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();
        // str.trim();
        str.toUpperCase();
        WordExample obj = new WordExample(str);
        obj.countWord();

        sc.close();

    }
}
