import services.dayOneService;
import services.dayTwoService;

import java.io.IOException;

public class AdventOfCode {

    public static void main(String[] args) throws IOException {
        //dayOneService service = new dayOneService();
        dayTwoService service = new dayTwoService();
        service.solve();
    }

}
