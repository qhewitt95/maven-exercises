package maven;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        StringUtils utils = new StringUtils();
        System.out.println(" Give us a word: ");
        Scanner scanner = new Scanner(System.in);
        String userWord = scanner.nextLine();
        StringUtils.reverse(userWord);
        System.out.printf("You Entered: %s\n", userWord);
        String isWordANumberMessage;
        if(StringUtils.isNumeric(userWord)){
            isWordANumberMessage = "IS A NUMBER";
        }else{
            isWordANumberMessage = "IS NOT A NUMBER";
        }
        System.out.printf("\"%s\"%s\n,",userWord,isWordANumberMessage);
        System.out.printf("FLipped Case: %s", StringUtils.swapCase(userWord));

        System.out.printf("Reverse: %s", StringUtils.reverse(userWord));


    }
}
