package main.java;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by vikasnaiyar on 25/09/18.
 */
public class JavaStream {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Vikas", "Dwijen", "Ankit");


        String result = list.parallelStream().collect(StringBuilder::new,
                (response, element) -> response.append(" ").append(element),
                (response1, response2) -> response1.append(",").append(response2.toString()))
                .toString();

        System.out.println("Result:" + result);


        List<Integer> list1 = Arrays.asList(23, 43, 12, 25);

        IntSummaryStatistics stats = list1.stream()
                .collect(Collectors.summarizingInt(i -> i + i));


        System.out.println("Sum:"+stats.getSum());


         list = Arrays.asList("Ram","Shyam","Shiv","Mahesh");
         result=  list.stream().collect(Collectors.joining(", "));
        System.out.println("Joining Result: "+ result);


        list1 = Arrays.asList(1,2,3,4);
        Double result1 = list1.stream().collect(Collectors.averagingInt(v->v*2));
        System.out.println("Average: "+result1);


        list1 = Arrays.asList(1,2,3,4);
        long result2=  list.stream().collect(Collectors.counting());
        System.out.println("Count: "+ result2);

    }

}
