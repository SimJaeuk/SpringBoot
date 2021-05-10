package taco.tacocloud;

// import taco.tacocloud.Ingredient;


public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Ingredient findOne(String id);
    Ingredient save(Ingredient ingredient);
    
}
