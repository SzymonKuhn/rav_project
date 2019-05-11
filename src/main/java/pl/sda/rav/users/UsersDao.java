package pl.sda.rav.users;

import org.slf4j.LoggerFactory;

import java.util.*;

import org.slf4j.Logger;

/**
 * 1. Stwórz klasę do przechowywania i aktualizacji użytkowników: UsersDao.
 * 2. Dodaj możliwość sortowania “naturalnego” dla użytkowników: użytkownicy powinni
 * być sortowani po loginie malejąco
 * 3. Dodaj metody do pobierania wszystkich użytkowników - posortowanych
 * 4. Dodaj metodę do dodawania użytkownika. Metoda powinna uniemożliwić dodanie
 * duplikatu do bazy!
 * 5. Dodaj metodę do wyszukania usera po loginie i haśle.
 * 6. * Dodaj metodę do usuwania użytkownika po id. Jeżeli użytkownik o podanym id nie
 * istnieje metoda powinna zwrócić false, w przeciwnym wypadku true.
 * 7. * Dodaj logowanie zdarzeń w klasie
 * 8. Dodaj testy do metod klasy
 */

public class UsersDao {
    private final Logger logger = LoggerFactory.getLogger(UsersDao.class);
    private Set<User> users = new HashSet<>();

    public Set<User> getUsers() {
        return new TreeSet<>(users);
    }

    public boolean add(User user) {
        if (users.contains(user)) {
            logger.error("User already exists in DAO, user: {}", user);
            return false;
        }

        users.add(user);
        return true;
    }

    public boolean remove(String login) {
        List<User> userList = new ArrayList<>(users);
        for (int i = 1; i < userList.size(); i++) {
            User user = userList.get(i);
            if (user.getLogin().equals(login)) {
                users.remove(user);
                return true;
            }
        }

        logger.warn("There is no user with login: ", login);
        return false;
    }

    public Optional<User> find(String login, String password) {
        return users.stream()
                .filter(user -> user.getLogin().equals(login) && user.getPassword().equals(password))
                .findFirst();
    }

}
