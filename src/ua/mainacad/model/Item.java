package ua.mainacad.model;

import lombok.*;
import lombok.extern.java.Log;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
@Log

public class Item {
    private String name;
    private int price;
    private int initPrice;


}
