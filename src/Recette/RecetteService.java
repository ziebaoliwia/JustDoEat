package Recette;

import java.util.List;

public class RecetteService {
    private RecetteRepository recetteRepository = new RecetteRepository();

    public List<Recette> getAllRecettes() {
        return recetteRepository.findAll();
    }

    public Recette getRecetteById(Long id) {
        return recetteRepository.findById(id);
    }

    public Recette createRecette(Recette recette) {
        return recetteRepository.save(recette);
    }

    public Recette updateRecette(Long id, Recette recette) {
        recette.setId(id);
        return recetteRepository.save(recette);
    }

    public void deleteRecette(Long id) {
        recetteRepository.deleteById(id);
    }
}
