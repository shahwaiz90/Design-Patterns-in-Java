package creationalpatterns.Singleton;

public class UserSingleton {
    private static UserSingleton userSingleton;
    private String name;

    private UserSingleton(){
        System.out.println("UserSingleton Created");
    }

    public static UserSingleton getInstance(){
        if(userSingleton!=null){
            return userSingleton;
        }else {
            userSingleton = new UserSingleton();
            return userSingleton;
        }
    }

    public void setUserName(String value){
        this.name = value;
    }

    public String getUserName(){
        return this.name;
    }
}
