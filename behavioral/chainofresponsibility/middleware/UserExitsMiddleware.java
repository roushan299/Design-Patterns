package behavioral.chainofresponsibility.middleware;

import behavioral.chainofresponsibility.server.Server;

public class UserExitsMiddleware extends Middleware{
    private Server server;

    public UserExitsMiddleware(Server server){
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
       if(!server.hasEmail(email)){
           System.out.println("This email is not registered");
           return false;
       }

       if(!server.isValidPassword(email, password)){
           System.out.println("Wrong password");
           return false;
       }

       return checkNext(email, password);
    }
}
