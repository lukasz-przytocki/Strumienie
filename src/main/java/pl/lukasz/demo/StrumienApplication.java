package pl.lukasz.demo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class StrumienApplication {
    public static void main(String[] args) {


        List<Integer> list = Stream.iterate(8, integer -> integer + 1)
                .filter(integer -> integer > 100)
                .peek(integer -> System.out.println(integer))
                .filter(integer -> integer % 5 == 0)
                .peek(integer -> System.out.println(integer))
                .map(i -> i * 3)
                .limit(10)
                .peek(i-> System.out.println(i))
                .collect((Collectors.toList()));

        System.out.println(list);
    }
}
