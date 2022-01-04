package org.db;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

public interface LeaderboardResource extends PanacheEntityResource<LeaderboardItem, Long> {
    
}
