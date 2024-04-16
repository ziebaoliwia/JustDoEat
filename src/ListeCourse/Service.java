package ListeCourse;

import java.util.List;

public class Service {
    private Repository listeCourseRepository = new Repository();

    public List<ListeCourse> getAllListesCourses() {
        return listeCourseRepository.findAll();
    }

    public ListeCourse getListeCourseById(Long id) {
        return listeCourseRepository.findById(id);
    }

    public ListeCourse createListeCourse(ListeCourse listeCourse) {
        return listeCourseRepository.save(listeCourse);
    }

    public ListeCourse updateListeCourse(Long id, ListeCourse listeCourse) {
        listeCourse.setId(id);
        return listeCourseRepository.save(listeCourse);
    }

    public void deleteListeCourse(Long id) {
        listeCourseRepository.deleteById(id);
    }
}
