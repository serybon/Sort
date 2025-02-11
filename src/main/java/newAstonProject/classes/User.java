package newAstonProject.classes;

public class User implements Comparable<User> {
    private final String name;
    private final String password;
    private final String email;

    private User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.password = userBuilder.password;
        this.email = userBuilder.email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public static class UserBuilder {
        private String name;
        private String password;
        private String email;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public int compareTo(User other) {
        int result = this.name.compareTo(other.name);
        if (result == 0) {
            result = this.password.compareTo(other.password);
            if (result == 0) {
                return this.email.compareTo(other.email);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("User [ name: %-10s password: %-10s email: %-10s ]", name, password, email);
    }
}
