package core.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {

    private Set<String> mySet = new HashSet<>();

    public SetExamples(Set<String> mySet) {
        this.mySet.add("one");
        this.mySet.add("one");
        this.mySet.add("two");
        this.mySet.add("three");
    }


    public void printSet(){
        for (String num : mySet){
            System.out.println(num);
        }
    }


}
