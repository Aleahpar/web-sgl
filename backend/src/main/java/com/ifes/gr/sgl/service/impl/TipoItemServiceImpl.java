package com.ifes.gr.sgl.service.impl;

import com.ifes.gr.sgl.repository.TipoItemRepository;
import com.ifes.gr.sgl.service.TipoItemService;
import com.ifes.gr.sgl.service.dto.TipoItemDTO;
import com.ifes.gr.sgl.service.mapper.TipoItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class TipoItemServiceImpl implements TipoItemService {
    private final TipoItemMapper tipoItemMapper;
    private final TipoItemRepository tipoItemRepository;

    @Override
    public List<TipoItemDTO> getAll() {
        return tipoItemMapper.toDto(tipoItemRepository.findAll());
    }

}
