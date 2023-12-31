package com.github.vitoria_abadia.vuttr.repository;

import com.github.vitoria_abadia.vuttr.DTO.ToolsResponseDTO;
import com.github.vitoria_abadia.vuttr.model.ToolsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.UUID;
@Repository
public interface ToolsRepository extends JpaRepository<ToolsModel, UUID> {
    List<ToolsResponseDTO> findAllByTags(String tag);
}