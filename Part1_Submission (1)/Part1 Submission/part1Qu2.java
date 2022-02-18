import java.util.*;
public class part1Qu2 {

    public static String reformatNumber(String number) {
        System.out.println("NEW ROUND -----------\n String : "+number);
        String newNum = "";
        //We will first remove all "-" and spaces from the number
        for (int i = 0; i < number.length(); i++) {
            if(number.charAt(i)!=' ' && number.charAt(i)!='-' ) {
                newNum= newNum + number.substring(i,i+1);
            }
        }

        //we will put the results in an arraylist and add() each entry as we go
        /*I could have used a simple [] who's length is the maximum possibility of
        possible substrings: newNum.length()/3 + 2  ... but that seemed too complicated for nothing
        * */
        ArrayList<String> results = new ArrayList<String>();
        // First round of division: maximum length of a block is 4
        //We will remove as many string blocks of 3 characters as we can
        if(newNum.length()>4){
            do{
               results.add(newNum.substring(0, 3));
                newNum = newNum.substring(3, newNum.length());
            }while (newNum.length() > 4);
        }
        //Second round of division: maximum length of block is 3
        if(newNum.length()==4){
            results.add(newNum.substring(0, 2));
            results.add(newNum.substring(2, 4));
        }else{
            results.add(newNum);
        }

        //Gathering the final string and separating each entry in results by "-"
        String answer = "";
        for(int i =0; i<results.size(); i++){
            if(i!=results.size()-1){
                answer = answer + results.get(i) + "-";
            }else{
                answer = answer + results.get(i);
            }
        }
        System.out.println(" Final answer "+answer);

        return answer;
    }


    public static void main(String[] args){
        //testcase 1:
        String test1 = "1-23-45 6";
        reformatNumber(test1);
        //testcase 2:
        String test2 = "123 4-567";
        reformatNumber(test2);
        //testcase 3:
        String test3 =  "123 4-5678";
        reformatNumber(test3);
        //testcase 4:
        String test4 =  "12";
        reformatNumber(test4);
        //testcase 5:
        String test5 =  "--17-5 229 35-39475 ";
        reformatNumber(test5);

    }

}
