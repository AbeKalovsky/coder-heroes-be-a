package com.bloomtechlabs.coderheroesbea.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feedback_badges")
public class FeedbackBadges {
    private int badge_id;
    private String name;
    private String image;

    /**
     * Constructor.
     * Default constructor is required to have Hibernate initialize the entity.
     */
    public FeedbackBadges() {

    }

    /**
     * Constructor with badge_id.
     * @param badge_id - primary key, auto-increments, generated by database
     */
    public FeedbackBadges(int badge_id) {
        this.badge_id = badge_id;

    }

    /**
     * Constructor with all fields.
     *
     * @param badge_id - primary key, auto-increments, generated by database
     * @param name     - string (not null)
     * @param image    - string (not null)
     */
    public FeedbackBadges(int badge_id, String name, String image) {
        this.badge_id = badge_id;
        this.name = name;
        this.image = image;
    }

    @Id
    @Column(name = "badge_id")
    public int getBadge_id() {
        return badge_id;
    }

    public void setBadge_id(int badge_id) {
        this.badge_id = badge_id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "image", nullable = false)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}