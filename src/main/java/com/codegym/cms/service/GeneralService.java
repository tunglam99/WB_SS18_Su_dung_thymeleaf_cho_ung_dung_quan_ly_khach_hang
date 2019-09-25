package com.codegym.cms.service;

import java.util.List;

public interface GeneralService<E> {
    List<E> findAll();
    E findById(Long id);
    void save(E model);
    void remove(Long id);
}
