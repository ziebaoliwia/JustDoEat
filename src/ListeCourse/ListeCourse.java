package ListeCourse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListeCourse {
    private Long id;
    private Date dateCreation;
    private List<Ingredient> ingredients;

    public ListeCourse() {
        this.ingredients = new ArrayList<>();
        this.dateCreation = new Date();
    }

    public ListeCourse(Long id, Date dateCreation, List<Ingredient> ingredients) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.ingredients = ingredients;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public void removeIngredient(Ingredient ingredient) {
        this.ingredients.remove(ingredient);
    }
}
