package com.careerit.ipl.stats.service;

import com.careerit.ipl.stats.domain.PlayerDetails;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface PlayerDetailsService {
    public List<PlayerDetails> importPlayer(MultipartFile file);
}
