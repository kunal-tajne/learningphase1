package lesson1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        RecommenderImplementation recommender = new RecommenderImplementation();

        String[] recommendedMovies = recommender.recommendMovies("Finding Dory");

        System.out.println(Arrays.toString(recommendedMovies));

    }

}
