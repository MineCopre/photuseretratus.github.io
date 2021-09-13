package pt.photuseretratus.webApp;

import java.util.Map;

public class URLInfo {

    String path;
    String tag;
    Map<String, String> transformation;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Map<String, String> getTransformation() {
        return transformation;
    }

    public void setTransformation(Map<String, String> transformation) {
        this.transformation = transformation;
    }
}