
public class UserManager {

	public void addUser(User user) {

		System.out.println(user.firstName + " " + user.lastName + " eklendi");
	}

	public void removeUser(User user) {
		System.out.println(user.firstName + " " + user.lastName + " silindi");
	}

	public void updateUser(User user) {
		System.out.println(user.firstName + " " + user.lastName + " güncellendi");
	}

}
