package in.co.nmsworks.test2;

public class NumberWords {
    public static void main(String[] args) {
        NumberWords nw = new NumberWords();
        nw.convertNumberToWord();
    }

    private void convertNumberToWord() {
        int n = 123;
        String words="";
        String value = String.valueOf(n);

        for (int i = 0; i < value.length(); i++) {
            switch (value.charAt(i)) {
                case 1:
                    words+="One" + " ";
                    break;
                case 2:
                    words+="Two" + " ";
                    break;
                case 3:
                    words+="Three" + " ";
                    break;
                case 4:
                    words+="Four" + " ";
                    break;
                case 5:
                    words+="Five" + " ";
                    break;
                case 6:
                    words+="Six" + " ";
                    break;
                case 7:
                    words+="Seven" + " ";
                    break;
                case 8:
                    words+="Eight" + " ";
                    break;
                case 9:
                    words+="Nine" + " ";
                    break;
                default:
                    break;
            }
        }
        System.out.println(words);
    }
}
