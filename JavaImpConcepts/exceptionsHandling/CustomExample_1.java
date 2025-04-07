class Response{
    private int statusCode;
    private String msg;
    
    public Response(int statusCode, String msg){
        this.statusCode = statusCode;
        this.msg = msg;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Response [statusCode=" + statusCode + ", msg=" + msg + "]";
    }


}

class UserNotFoundException extends Exception{
    private Response response;

    public UserNotFoundException(int statusCode, String msg){
           super(msg);
           this.response = new Response(statusCode, msg);
    }
    public Response getResponse() {
        return response;
    }
}

public class CustomExample_1 {
    public static void validateUser(String username) throws UserNotFoundException{

        if(!username.equals("Admin")){
            throw new UserNotFoundException(404, "User not found: " + username);
            
        }
        System.out.println("User is valid "+username);

    }
    public static void main(String[] args) {
        try {
            validateUser("User");
        } catch (UserNotFoundException e) {
           System.out.println(e.getResponse());
        }
        
    }
}
