package br.edu.ifpb.tccii.materialzone.service;

import br.edu.ifpb.tccii.materialzone.abstration.CategoriaService;
import br.edu.ifpb.tccii.materialzone.domain.Categoria;
import br.edu.ifpb.tccii.materialzone.repository.CategoriaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public Categoria save(Categoria categoria) {
        log.debug("Request to save Categoria : {}", categoria);
        return categoriaRepository.save(categoria);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Categoria> findAll() {
        log.debug("Request to get all Categorias");
        return categoriaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Categoria> findOne(String id) {
        log.debug("Request to get Categoria : {}", id);
        return categoriaRepository.findById(id);
    }

    @Override
    public void delete(String id) {
        log.debug("Request to delete Categoria : {}", id);
        categoriaRepository.deleteById(id);
    }

}
