package tacos;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Taco {


    @NotNull
    @Size(min=5, message="Imie musi zawierac przynajmnie 5 znakow")

    private String name;

    @Size(min=1, message="Musisz wybrac jeden skladnik")

    private List<String> ingredients;

}

