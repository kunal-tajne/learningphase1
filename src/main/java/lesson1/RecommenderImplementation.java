package lesson1;

public class RecommenderImplementation {

    public String[] recommendMovies(String movie)
    {
        ContentBasedFilter filter = new ContentBasedFilter();

        String[] recommendedMovies = filter.getRecommendations(movie);

        return recommendedMovies;
    }
}
