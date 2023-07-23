package model;

import com.sun.jdi.connect.Connector;

public class Data {
    private int id;
    private String fileName;

    public String getPath() {
        return path;
    }

    public Data(int id,String fileName,String path) {
       this.id=id;
        this.fileName = fileName;
        this.path=path;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPath(String path) {
        this.path = path;
    }

    private String path;
    private String email;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Data(int id, String fileName, String path, String email) {
      this.id = id;
      this.fileName = fileName;
      this.path = path;
      this.email = email;
    }
}
