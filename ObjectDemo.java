class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return age == user.age && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        User user1 = new User("Alice", 25);
        User user2 = new User("Alice", 25);

        System.out.println(user1);
        System.out.println(user1.equals(user2));
    }
}
