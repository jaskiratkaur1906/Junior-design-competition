import java.util.*;
public class part1Qu1 {
public static int countMatches(ArrayList<ArrayList<String>> test, String ruleKey, String ruleValue){
    int key=0;
    int results=0;
    //we need to know at which index is the attribute we are looking for
    switch(ruleKey){
        case "type": key=0; break;
        case "color": key=1; break;
        case "name": key=2; break;
    }
    //we will look for the attribute at index "key" of each object of strings
    //thus we need to iterate through the list of objects of strings
    for(int i=0; i<test.size(); i++){
        if(test.get(i).get(key).equals(ruleValue)){
           // System.out.println(test.get(i).get(key));
            results++;
        }
    }
    return results;
}

public static void main(String[] args){
    //2d arrays of strings or An Array of Objects and each object is an array of strings
    //Each object is an array of strings containing 3 strings exactly
    //the format of each object is [type, color, name]
    // the type of each string is a "ruleKey"  and its value is "ruleValue"

    //testcase1:
    ArrayList<ArrayList<String>> test1 = new ArrayList<>();
    ArrayList<String> test10= new ArrayList<String>();
    test10.add("phone");
    test10.add("blue");
    test10.add("pixel");
    test1.add(test10);
    ArrayList<String> test11= new ArrayList<String>();
    test11.add("computer");
    test11.add("silver");
    test11.add("lenovo");
    test1.add(test11);
    ArrayList<String> test12= new ArrayList<String>();
    test12.add("phone");
    test12.add("bgold");
    test12.add("iphone");
    test1.add(test12);
    System.out.println(countMatches(test1, "color", "silver" ));

    //testcase2:
    ArrayList<ArrayList<String>> test2 = new ArrayList<>();
    ArrayList<String> test20= new ArrayList<String>();
    test20.add("phone");
    test20.add("blue");
    test20.add("pixel");
    test2.add(test20);
    ArrayList<String> test21= new ArrayList<String>();
    test21.add("computer");
    test21.add("silver");
    test21.add("phone");
    test2.add(test21);
    ArrayList<String> test22= new ArrayList<String>();
    test22.add("phone");
    test22.add("gold");
    test22.add("iphone");
    test2.add(test22);

    System.out.println(countMatches(test2, "type", "phone" ));

}

}
