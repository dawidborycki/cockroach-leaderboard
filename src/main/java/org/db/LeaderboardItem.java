package org.db;

import javax.enterprise.inject.Produces;
import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class LeaderboardItem extends PanacheEntity {
    
    @Column
    public String name;

    @Column    
    public double points;    
}
