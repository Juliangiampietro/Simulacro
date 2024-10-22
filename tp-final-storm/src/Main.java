import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Airport;

public class Main {
    public static void main(String[] args) {

        File file = new File("archi.json");
        ObjectMapper mapper = new ObjectMapper();

       List <Airport> airports = new ArrayList<>();
        try {
            airports=mapper.readValue(file, new TypeReference<List<Airport>>() {});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(airports);

    }
}