package io.github.dearzack.jardependence.db.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Zack on 2017/9/8.
 */
@Entity
public class Book {

    @Id
    private Long id;
    private String name;
    @Generated(hash = 381496039)
    public Book(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    @Generated(hash = 1839243756)
    public Book() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
