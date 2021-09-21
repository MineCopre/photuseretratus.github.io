package pt.photuseretratus.webApp;

import com.google.gson.Gson;
import io.imagekit.sdk.ImageKit;
import io.imagekit.sdk.config.Configuration;
import io.imagekit.sdk.models.BaseFile;
import io.imagekit.sdk.models.results.ResultList;
import io.imagekit.sdk.utils.Utils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImageKitIO {

    ImageKit imageKit;
    Configuration configuration;
    private static final Gson gson = new Gson();

    public ImageKitIO() throws IOException {
        this.imageKit = ImageKit.getInstance();
        configuration = new Configuration();
        configuration.setPrivateKey(System.getenv("IMAGEKITIOPRIV"));
        configuration.setPublicKey("public_TGL83sxiUWGZfYFL0MMz9r7AXTw=");
        configuration.setUrlEndpoint("https://ik.imagekit.io/minecopre");
        this.imageKit.setConfig(configuration);
    }

    public String getURL(URLInfo urlInfo) {

        Map<String , String> search=new HashMap<>();

        List<Map<String, String>> transformation = new ArrayList<Map<String, String>>();
        transformation.add(urlInfo.getTransformation());

        Map<String, Object> options = new HashMap<>();
        options.put("path", urlInfo.getPath()+urlInfo.getName());
        options.put("transformation", transformation);

        return imageKit.getUrl(options);

    }

    public ResponseEntity<List<String>> getPortfolioSection(){

        List<String> list = new ArrayList<String>();
        Map<String , String> options=new HashMap<>();
        options.put("path","");
        options.put("type", "folder");

        ResultList resultList=imageKit.getFileList(options);

        for(int i = 0; i < resultList.getResults().size(); i++){
            list.add(resultList.getResults().get(i).getName());
        }

        return ResponseEntity.ok(list);
    }

    public ResponseEntity<List<String>> getFolderList(String folder) {

        List<String> list = new ArrayList<String>();

        Map<String , String> options=new HashMap<>();
        options.put("path",folder);

        ResultList resultList=imageKit.getFileList(options);

        for(int i = 0; i < resultList.getResults().size(); i++){
            list.add(resultList.getResults().get(i).getUrl());
        }

        return ResponseEntity.ok(list);

    }
}