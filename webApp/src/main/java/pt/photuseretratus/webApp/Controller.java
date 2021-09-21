package pt.photuseretratus.webApp;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import com.google.gson.Gson;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {



    @CrossOrigin(origins = "*")
    @PostMapping(
            path="/imagekitio/getUrl",
            produces = MediaType.TEXT_PLAIN_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String getUrl(@RequestBody URLInfo urlInfo) throws IOException {
        ImageKitIO imageKitIO = new ImageKitIO();
        return imageKitIO.getURL(urlInfo);
    }

    @CrossOrigin(origins = "*")
    @PostMapping(
            path="/imagekitio/carousel",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> carousel(@RequestBody String folder) throws IOException {
        ImageKitIO imageKitIO = new ImageKitIO();
        return imageKitIO.getFolderList(folder);

    }

    @CrossOrigin(origins = "*")
    @PostMapping(
            path="/imagekitio/generatePortfolioSection",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> generatePortfolioSection() throws IOException {
        ImageKitIO imageKitIO = new ImageKitIO();
        return imageKitIO.getPortfolioSection();
    }

}


