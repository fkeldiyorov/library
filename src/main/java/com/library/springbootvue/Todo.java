package com.library.springbootvue;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Setter
@Getter
@Entity
@Data
@NoArgsConstructor
public class Todo {

    @Id @GeneratedValue
    private Long id;

    @NonNull
    private String title;

    private Boolean completed = false;

    public void setTitle(String name) {
        this.title=name;
    }
}
