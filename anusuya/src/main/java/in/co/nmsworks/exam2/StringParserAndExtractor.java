package in.co.nmsworks.exam2;

public class StringParserAndExtractor {

    public static void main(String[] args) {

        StringParserAndExtractor sp = new StringParserAndExtractor();

        String jsonFormattedString = "{ \"name\": \"John\", \"age\": 30, \"department\": \"cse\"}";

        sp.printExtractedString(jsonFormattedString);
    }

    private void printExtractedString(String jsonFormattedString) {

        if (jsonFormattedString.isEmpty() || jsonFormattedString == null){
            System.out.println("Can't do any operations !!!");
        }
        else{

            String[] splittedString = jsonFormattedString.split(",");
            for (String word : splittedString) {
                String sentence = word.replace('"',' ');
                String[] splittedSentence = sentence.split(":");
                for (String extractedWord : splittedSentence) {
                    if ((extractedWord.contains("{"))){
                        extractedWord = extractedWord.replace('{',' ');
                    }
                    if (splittedSentence[1].equals(extractedWord)){
                        System.out.print(" is ");
                    }
                    if ((extractedWord.contains("}"))){
                        extractedWord = extractedWord.replace('}',' ');
                    }
                    System.out.print(extractedWord.trim());
                }
                System.out.println();
            }

        }
    }
}
