package easymail;


public class Mail {
    private String user;
    private String password;
    private String path;
    private String filename;
    private String to;
    private String subject;
    private String message;

    public Mail(String user, String password, String path, String filename, String to, String subject, String message) {
        this.user = user;
        this.password = password;
        this.path = path;
        this.filename = filename;
        this.to = to;
        this.subject = subject;
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
   
    
}
