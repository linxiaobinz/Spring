public class UserServiceImp implements UserService {
    public void register(User user) {
        System.out.println("UserServiceImpl.register 业务运算 + DAO ");
    }

    public boolean login(String name, String password) {
        System.out.println("UserServiceImpl.login");
        return true;
    }
}
