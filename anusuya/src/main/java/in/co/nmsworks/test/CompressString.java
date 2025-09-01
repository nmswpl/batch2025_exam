package in.co.nmsworks.test;

public class CompressString {

    public static void main(String[] args) {

        CompressString cs = new CompressString();

        String input = null;
        String result = cs.compressString(input);

        System.out.println("Input String before Compression : " + input);
        System.out.println("Result String After Compression : " + result);
    }

    private String compressString(String input){

        if (input.isEmpty()){
            System.out.println("Empty String!!");
        }

        if (input == null){
            System.out.println("CAN'T DO ANY OPERATIONS IN NULL");
        }

        if (!input.isEmpty()){
            StringBuilder resultString = new StringBuilder();

            char[] inputArray = input.toCharArray();
            int count = 1;
            int i;


            for (i = 1; i < inputArray.length; i++){
                if (inputArray[i] == inputArray[i-1]){
                    count++;
                }
                else{
                    resultString.append(count);
                    resultString.append(inputArray[i-1]);
                    count = 1;
                }
            }
            resultString.append(count);
            resultString.append(inputArray[i-1]);
            return resultString.toString();
        }
        return null;
    }
}
