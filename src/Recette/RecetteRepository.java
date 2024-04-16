package Recette;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecetteRepository {
    private Map<Long, Recette> recettes = new HashMap<>();
    private Long nextId = 1L;

    public List<Recette> findAll() {
        return new ArrayList<>(recettes.values());
    }

    public Recette findById(Long id) {
        return recettes.get(id);
    }

    public Recette save(Recette recette) {
        if (recette.getId() == null) {
            recette.setId(nextId++);
        }
        recettes.put(recette.getId(), recette);
        return recette;
    }

    public void deleteById(Long id) {
        recettes.remove(id);
    }
}
