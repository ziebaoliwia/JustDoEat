package ListeCourse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/listes-courses")
public class Controller {

    private final Service listeCourseService;

    public Controller(Service listeCourseService) {
        this.listeCourseService = listeCourseService;
    }

    @GetMapping
    public ResponseEntity<List<ListeCourse>> getAllListesCourses() {
        List<ListeCourse> listesCourses = listeCourseService.getAllListesCourses();
        return new ResponseEntity<>(listesCourses, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ListeCourse> getListeCourseById(@PathVariable Long id) {
        ListeCourse listeCourse = listeCourseService.getListeCourseById(id);
        if (listeCourse != null) {
            return new ResponseEntity<>(listeCourse, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<ListeCourse> createListeCourse(@RequestBody ListeCourse listeCourse) {
        ListeCourse createdListeCourse = listeCourseService.createListeCourse(listeCourse);
        return new ResponseEntity<>(createdListeCourse, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ListeCourse> updateListeCourse(@PathVariable Long id, @RequestBody ListeCourse listeCourse) {
        ListeCourse updatedListeCourse = listeCourseService.updateListeCourse(id, listeCourse);
        if (updatedListeCourse != null) {
            return new ResponseEntity<>(updatedListeCourse, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteListeCourse(@PathVariable Long id) {
        listeCourseService.deleteListeCourse(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
