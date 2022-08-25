package com.careerit.ipl.stats.repository;

import com.careerit.ipl.stats.domain.PlayerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerDetailsRepo extends JpaRepository<PlayerDetails,Long> {
}
