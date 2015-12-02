

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws Exception {
        String content = new String(Files.readAllBytes(Paths.get("way.json")));
        JSONObject jsonObject = new JSONObject(content);

        System.out.println("Content2:" + jsonObject.get("points"));
    }
}
