public class Lesson_9 {
    public static void main(String[] args) throws WrongPasswordException, WrongLoginException {
        try {
            new Regestration("aaa", "aaa", "aaa");
            Regestration.userValidators("aaa", "aaa", "aaa");
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
        try {
            new Regestration("aaaaaaaaaaaaaaaaaaaa", "aaa", "aaa");
            Regestration.userValidators("aaaaaaaaaaaaaaaaaaaa", "aaa", "aaa");
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
        try {
            new Regestration("aaa", "aaa", "111");
            Regestration.userValidators("aaa", "aaa", "111");
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }


        try {
            new Regestration("aaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaa");
            Regestration.userValidators("aaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaa");
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
