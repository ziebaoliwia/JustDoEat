package ListeCourse;

import java.util.List;

public class Controller {
    private Service listeCourseService = new Service();

    public List<ListeCourse> getAllListesCourses() {
        return listeCourseService.getAllListesCourses();
    }

    public ListeCourse getListeCourseById(Long id) {
        return listeCourseService.getListeCourseById(id);
    }

    public ListeCourse createListeCourse(ListeCourse listeCourse) {
        return listeCourseService.createListeCourse(listeCourse);
    }

    public ListeCourse updateListeCourse(Long id, ListeCourse listeCourse) {
        return listeCourseService.updateListeCourse(id, listeCourse);
    }

    public void deleteListeCourse(Long id) {
        listeCourseService.deleteListeCourse(id);
    }
}
