/**
 * Created by Vera Lifanova
 * Date: 04.05.2022
 */

public class DbSetting {
    private String name;
    private String password;

    public DbSetting(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
