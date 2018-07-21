package com.simplus.gestao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.simplus.gestao.domain.Product;
import com.simplus.gestao.domain.Company;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Transactional(readOnly=true)
    @Query("SELECT obj FROM Product obj WHERE obj.company.id = :companyId ORDER BY obj.lastUpdate")
    public List<Product> findProducts(@Param("companyId") Integer company_id);

    @Transactional(readOnly=true)
    @Query("SELECT obj FROM Product obj WHERE CHARACTER_LENGTH(obj.gtin)=13 ORDER BY last_update")
    public List<Product> findAllBy13();

    @Transactional(readOnly=true)
    @Query("SELECT obj FROM Product obj WHERE CHARACTER_LENGTH(obj.gtin)=14 ORDER BY last_update")
    public List<Product> findAllBy14();


}
/*
SELECT
com.id AS company_id,
com.name AS company_name,
pro.id AS product_id,
pro.description AS product_desciption
FROM simplus.company com
LEFT JOIN simplus.product pro ON pro.company_id = com.id
WHERE CHARACTER_LENGTH(gtin)=13 ORDER BY last_update

@Transactional(readOnly=true)
	@Query("SELECT DISTINCT obj FROM Produto obj INNER JOIN obj.categorias cat WHERE obj.nome LIKE %:nome% AND cat IN :categorias")
	Page<Produto> findDistinctByNomeContainingAndCategoriasIn(@Param("nome") String nome, @Param("categorias") List<Categoria> categorias, Pageable pageRequest);

 */