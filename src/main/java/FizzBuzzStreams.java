import java.util.stream.IntStream;

/**
 * Created by j.vallet@validus-ivc.co.uk on 05/04/16.
 */
public class FizzBuzzStreams {

    public static String fizzbuzz(Integer e) {
        if (e % 15 == 0) {
            return "FIZZBUZZ";
        } else if ( e % 3 == 0) {
            return "FIZZ";
        } else if ( e % 5 == 0) {
            return "BUZZ";
        } else {
            return e.toString();
        }
    }

    public static void main (String [] args) {
        IntStream.rangeClosed(1, 100).mapToObj(p -> fizzbuzz(p)).forEach( s -> System.out.print(s+" "));
    }

}
