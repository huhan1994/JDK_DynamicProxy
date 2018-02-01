public class UserServiceImol implements UserService{

    @Override
    public void addUser() {
        System.out.println("用户已经增加!");
    }

    @Override
    public void deleteUser() {
        System.out.println("用户已经删除!");
    }

    @Override
    public void updateUser() {
        System.out.println("用户已经更新!");
    }
}
