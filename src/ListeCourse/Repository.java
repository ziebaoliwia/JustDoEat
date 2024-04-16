package ListeCourse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repository {
    private Map<Long, ListeCourse> listesCourses = new HashMap<>();
    private Long nextId = 1L;

    public List<ListeCourse> findAll() {
        return new ArrayList<>(listesCourses.values());
    }

    public ListeCourse findById(Long id) {
        return listesCourses.get(id);
    }

    public ListeCourse save(ListeCourse listeCourse) {
        if (listeCourse.getId() == null) {
            listeCourse.setId(nextId++);
        }
        listesCourses.put(listeCourse.getId(), listeCourse);
        return listeCourse;
    }

    public void deleteById(Long id) {
        listesCourses.remove(id);
    }
}
