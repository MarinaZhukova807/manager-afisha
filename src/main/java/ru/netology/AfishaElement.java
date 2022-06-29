package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AfishaElement {
    private int id;
    private String filmName;
    private String filmGenre;
    private String filmPoster;
    private Boolean premiereTomorrow;
}
